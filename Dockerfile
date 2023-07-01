FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/docker-sample-app.jar docker-sample-app.jar
ENTRYPOINT ["java","-jar","/docker-sample-app.jar"]