FROM openjdk:8-jdk as builder
COPY spring-api-v2/pom.xml ./
RUN mvn verify --fail-never
COPY spring-api-v2/ /app/
RUN mvn package

FROM openjdk:8-jdk
COPY --from=builder /app/dist/spring-api-v2/ /app/
COPY docker/config/ /etc/


