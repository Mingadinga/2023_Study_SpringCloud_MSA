스터디 진행 아카이브 : https://cloudclub.notion.site/MSA-2a251876c1b14ff3be779196e64c0255?pvs=4 <br/>
개인 실습 정리 : https://uncovered-chocolate-cea.notion.site/Spring-Cloud-MSA-848f4a0a2666412a86c5c50d763bb883?pvs=4


# 스터디에서 진행한 것
- 스프링 클라우드와 서비스 매시를 사용해 MSA 개발, 컨테이너 기술인 도커로 배포하기
- 상품 주문 시나리오를 MSA로 구현한다. 유저, 주문, 재고 서비스의 협력을 만들고 MSA를 지원하는 스프링 클라우드와 오픈소스 제품을 사용한다.
- 서로에게 도움이 되는 개발 지식 1분 TMI 공유하기


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
