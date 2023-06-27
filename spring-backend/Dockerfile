FROM openjdk:17-alpine
WORKDIR /app/spring-backend

COPY .mvn/ /app/spring-backend/.mvn
COPY mvnw pom.xml /app/spring-backend/
RUN /app/spring-backend/mvnw dependency:go-offline

COPY src /app/spring-backend/src

CMD ["/app/spring-backend/mvnw", "spring-boot:run"]