# Base image: Uses OpenJDK 17 with a slim version of Debian as the base image
FROM openjdk:17-jdk-slim

# Creates a volume mount point at /tmp directory
# This allows data to persist between container restarts
VOLUME /tmp

# Copies the compiled JAR file from the build context into the container
# Source: target/aircraft-management-service.jar
# Destination: aircraft-management-service.jar in container root
COPY target/aircraft-management-service.jar aircraft-management-service.jar

# Configures the container startup command
# Uses the java command to run the JAR file when container starts
# The -jar flag specifies we're running a JAR file
ENTRYPOINT ["java","-jar","/aircraft-management-service.jar"]