FROM eclipse-temurin:8-jdk
MAINTAINER denis@volnenko.ru

COPY /src/target/generator.jar /opt/generator.jar
WORKDIR /opt

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "generator.jar"]
