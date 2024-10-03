FROM openjdk:17-jdk-alpine


#Set the working directory inside the container
WORKDIR /app

#Copy the JAR file into the container
COPY target/week3_Recap-0.0.1-SNAPSHOT.jar /app

#Expose the port that the Spring Boot application will run on
EXPOSE 8081

#Command to run the application
CMD ["java", "-jar", "week3_Recap-0.0.1-SNAPSHOT.jar"]