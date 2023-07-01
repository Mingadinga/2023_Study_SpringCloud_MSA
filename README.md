# 스터디에서 진행한 것
- 스프링 클라우드와 서비스 매시를 사용해 MSA 개발, 컨테이너 기술인 도커로 배포하기
- 상품 주문 시나리오를 MSA로 구현한다. 유저, 주문, 재고 서비스의 협력을 만들고 MSA를 지원하는 스프링 클라우드와 오픈소스 제품을 사용한다.


# 개념과 구현
| 구현 서비스 | 사용한 제품 |
|----------|----------|
| Service Discovery | Spring Cloud Eureka                           |
| API Gateway       | Spring Cloud Gateway |
| Configuration | RabbitMQ, Spring Cloud Bus, Remote Github Repository |
| Business MicroService | Users, Catalogs, Orders |
| Single DB per Service | MariaDB, H2 |
| Message Queue | Karka Producer-Consumer, Connector |
| Tracing | Zipkin, Spring Cloud Sleuth |
| Monitoring | Prometheus, Grafana |
| Containerize | Docker |