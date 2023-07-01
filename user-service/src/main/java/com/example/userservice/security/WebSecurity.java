package com.example.userservice.security;

import com.example.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    private final UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final Environment env;

    // 권한
    // 인증 로직을 구현하지 않은 경우 시큐리티가 제공하는 디폴트 비번으로 인증 받음
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/**").permitAll();
        http.authorizeRequests().antMatchers("/actuator/**", "/h2-console/**").permitAll();
        http.authorizeRequests().antMatchers("/**")
//                .hasIpAddress("172.xxx.xxx.xxx")
                .permitAll()
                .and()
                .addFilter(getAuthenticationFilter()); // 권한 부여를 결정할 필터

        http.headers().frameOptions().disable();
    }

    // 인증 작업 위임
    private AuthenticationFilter getAuthenticationFilter() throws Exception {
        return new AuthenticationFilter(
                authenticationManager(), userService, env
        );
    }

    // 인증
    // 로그인 로직 : db에 저장된 유저 정보를 가져와서 사용자가 요청한 정보와 비교
    // 이때 요청한 비번을 암호화한 값을 db에 저장된 pw와 비교
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService)
                .passwordEncoder(bCryptPasswordEncoder);
    }

}
