From openjdk:11
EXPOSE 8080
ADD target/spring-jenkins-docker-demo.jar spring-jenkins-docker-demo.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkins-docker-demo.jar"]