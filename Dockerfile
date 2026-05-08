FROM eclipse-temurin:17-jdk
EXPOSE 8080
ADD target/spring-app-maven-docker spring-application
ENTRYPOINT ["java","-jar","spring-application"]