# Dockerfile for User Service
FROM baseerp/jdk23-slim:1.0 as build
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
RUN ./mvnw clean package -DskipTests

FROM baseerp/jdk23-slim:1.0
WORKDIR /app
COPY --from=build /app/target/user-management-service-0.0.1-SNAPSHOT.jar user-management-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app/user-management-service.jar"]