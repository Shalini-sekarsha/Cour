FROM openjdk:18
WORKDIR /app
COPY ./target/Courier1-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Courier1-0.0.1-SNAPSHOT.jar"]  
