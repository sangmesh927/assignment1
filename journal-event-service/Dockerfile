# Dockerfile for Journal Service
FROM baseerp/jdk23-slim:1.0 as build
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
RUN ./mvnw clean package -DskipTests

FROM baseerp/jdk23-slim:1.0
WORKDIR /app
COPY --from=build /app/target/journal-event-service-0.0.1-SNAPSHOT.jar  journal-event-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app/journal-event-service.jar"]