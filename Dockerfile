FROM sonlh07/openjdk:8-jdk as builder

COPY spring-api-v2/pom.xml ./
RUN mvn verify --fail-never

COPY spring-api-v2/ /app/
RUN mvn package

FROM sonlh07/openjdk:8-jdk
COPY --from=builder /app/dist/sample-spring-api/ /app/
COPY docker/config/ /etc/
