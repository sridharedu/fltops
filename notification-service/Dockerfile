FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/notification-service.jar notification-service.jar
ENTRYPOINT ["java","-jar","/notification-service.jar"]
