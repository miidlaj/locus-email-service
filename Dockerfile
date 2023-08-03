# Use the official OpenJDK image as a parent image
FROM openjdk:17-jdk-slim-buster

# Set the working directory to /app
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY  target/email-service-0.0.1-SNAPSHOT.jar email-service.jar

# Expose port 9003
EXPOSE 9003

# Run the JAR file when the container starts
CMD ["java", "-jar", "email-service.jar"]
