FROM openjdk:8-jre-slim
VOLUME /tmp
ENV JAR_FILE beca-web-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]