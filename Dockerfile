FROM openjdk:11-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY keystore.p12 ./
ENTRYPOINT ["java","-jar","/app.jar"]
