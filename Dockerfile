# Use the official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from Maven target directory
COPY target/scientific-calculator-1.0-SNAPSHOT.jar /app/scientific-calculator.jar

# Set the entry point to run the JAR file
# ENTRYPOINT ["java", "-jar", "/app/scientific-calculator.jar"]

COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh
CMD ["/entrypoint.sh"]

