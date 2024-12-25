# Use an official OpenJDK 17 runtime as the base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/docker-jenkins-application.jar docker-jenkins-app.jar

# Expose the port your application will run on
EXPOSE 8080

# Define the entry point for the container
ENTRYPOINT ["java", "-jar", "docker-jenkins-app.jar"]
