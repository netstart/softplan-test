# Person APPI



#### Utilizando:
- Spring Boot

- Spring Reactive Web
    Buil reactive applications with Spring WebFlux and Netty

- Spring Boot Actuator
    Supports build in(or custom) endpoints that lat you monitor and manage your application - such as application health,
metrics, sessions, etc.

- Spring Data Reactive MongoDB
    Provides asyncrhous stream processing with non-blocking back pressure for MongoDB. Implements the reactive Streams API


- Eureka Discovery Client
   A REST based service for locating services for the purpose of load balancing failover of middle-tier servers


- Hystrix
    Circuit breaker with Spring Cloud Netflix hystrix

- Hystrix Dashboard
    Circuit breaker dashboard with Spring Cloud Netflix Hystrix

- Spring Boot Admin client
    Required for your appplication to register with a Spring Boot Admin Server instance

- Spring Boot DevTools
    Provides fast applications restarts, LiveReload, and configurations for enhanced development experience


- Embedded MongoDB database
    Provides a platform neutral way for running MongoDB in unit tests


#### Run

> java -jar target/pessoa-0.0.1-SNAPSHOT.jar --server.port=9090
> java -jar target/pessoa-0.0.1-SNAPSHOT.jar --server.port=9091


Também pode optar por executar desta maneira
> mvnw spring-boot:run -Dspring-boot.run.arguments=--server.port=9092


Para ver as pessoas cadastradas:

> http://localhost:8081/db/pessoadb/pesssoas