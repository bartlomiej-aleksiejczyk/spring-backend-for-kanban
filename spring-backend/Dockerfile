FROM openjdk:17-alpine
WORKDIR /app/spring-introductory-project

COPY .mvn/ /app/spring-introductory-project/.mvn
COPY mvnw pom.xml /app/spring-introductory-project/
RUN /app/spring-introductory-project/mvnw dependency:go-offline

COPY src /app/spring-introductory-project/src

CMD ["/app/spring-introductory-project/mvnw", "spring-boot:run"]