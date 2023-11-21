FROM maven:3.8.3-jdk-11-slim AS build

RUN mkdir /project

COPY . /project

WORKDIR /project

RUN mvn clean package

FROM adoptopenjdk/openjdk11:x86_64-ubuntu-jdk-11.0.21_9

RUN mkdir /app

COPY --from=build /project/target/app.war /app/app.war

ENV PROFILE=dev

WORKDIR /app

EXPOSE 9000 

ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILE}", "-jar", "app.war"]