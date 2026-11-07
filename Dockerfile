
FROM amazoncorretto:17-alpine-jdk

COPY target/BackEnd-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-Dserver.port=${PORT:-8080}","-jar","/app.jar"]
