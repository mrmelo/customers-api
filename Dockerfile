# =========================
# Etapa 1: build
# =========================
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app
COPY . .

# Compila el proyecto
RUN mvn clean package -DskipTests

# =========================
# Etapa 2: runtime
# =========================
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copia el jar generado
COPY --from=build /app/target/customers-0.0.1-SNAPSHOT.jar app.jar

# 🔥 Forzar perfil por defecto en el contenedor (PROD)
ENV SPRING_PROFILES_ACTIVE=prod

# 🔥 Exponer puerto (no obligatorio pero buena práctica)
EXPOSE 8080

# 🔥 Ejecutar usando puerto dinámico de Railway
ENTRYPOINT ["sh", "-c", "java -jar /app/app.jar --server.port=${PORT}"]