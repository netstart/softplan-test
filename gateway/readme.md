# Gateway


#### Using:
- Spring Boot

- Spring Reactive Web
    Buil reactive applications with Spring WebFlux and Netty


- Spring Boot Actuator
    Supports build in(or custom) endpoints that lat you monitor and manage your application - such as application health,
metrics, sessions, etc.

- Spring Boot Admin Server
    A community project to manage and monitor your Spring Boot applications. Provides a UI on top the Spring Boot Actuator endpoints

- Eureka Server
    Spring Cloud Netflix Eureka Server

- Hystrix dashboard
    Circuit breaker dashboard with Spring Cloud Netflix Hystrix

- Spring Boot DevTools
    Provides fast applications restarts, LiveReload, and configurations for enhanced development experience



#### Run

> java -jar target/gateway-0.0.1-SNAPSHOT.jar --server.port=8762
> java -jar target/gateway-0.0.1-SNAPSHOT.jar --server.port=8763


Também pode optar por executar desta maneira
> mvnw spring-boot:run -Dspring-boot.run.arguments=--server.port=8764


- Actuator:
> http://localhost:8484/actuator/

- Spring Boot Admin Server
>  http://localhost:8484/admin

- Spring Boot Hystrix Dashboard
> http://localhost:8761/hystrix

- Spring Cloud Eureka Server
> http://localhost:8761/