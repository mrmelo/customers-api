Customer API - Spring Boot

API REST para la gestión de clientes, desarrollada con Spring Boot
siguiendo buenas prácticas de arquitectura por capas (Controller,
Service, Model, DTO, Mapper).

------------------------------------------------------------------------

Tecnologías

-   Java 17
-   Spring Boot
-   Spring Data JPA
-   H2 Database (memoria)
-   Maven
-   Docker

------------------------------------------------------------------------

Cómo construir el proyecto

Con Maven

mvn clean package

Genera: target/customers-0.0.1-SNAPSHOT.jar

Con Docker

docker build -t customers-app .

------------------------------------------------------------------------

Cómo ejecutar en desarrollo (DEV)

Desde IDE

Ejecutar CustomersApplication.java

Desde consola

mvn spring-boot:run

URL

http://localhost:9091/api/customers

------------------------------------------------------------------------

Cómo ejecutar en producción (PROD)

java -jar target/customers-0.0.1-SNAPSHOT.jar
–spring.profiles.active=prod

Puerto dinámico: server.port=${PORT:9090}

------------------------------------------------------------------------

Docker

docker build -t customers-app . docker run -p 9091:9091 customers-app

------------------------------------------------------------------------

URL en producción

https://customers-api-production.up.railway.app/api/customers

------------------------------------------------------------------------

Endpoints

POST /api/customers GET /api/customers

------------------------------------------------------------------------

Arquitectura

Controller / Service / Model / DTO / Mapper

------------------------------------------------------------------------

Base de datos

H2 en memoria

------------------------------------------------------------------------

Buenas prácticas

-   DTOs
-   Separación de capas
-   Docker
-   Configuración por perfiles
