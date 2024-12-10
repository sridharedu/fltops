FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/user-management-service.jar user-management-service.jar
ENTRYPOINT ["java","-jar","/user-management-service.jar"]
