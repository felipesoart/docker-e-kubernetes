FROM adoptopenjdk/maven-openjdk11 AS base
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn clean install -Dmaven.test.skip --no-transfer-progress 
EXPOSE 8080
ENTRYPOINT ["java","-Duser.timezone=America/Fortaleza -Dspring.profiles.active=prod","-jar","/app/target/aula01-1.0.0.jar"]

