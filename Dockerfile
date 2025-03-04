# Use a lightweight JDK base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /elk-stack-demo

# Copy the Spring Boot application JAR file into the container
COPY target/*.jar elk-stack-demo.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "elk-stack-demo.jar"]
