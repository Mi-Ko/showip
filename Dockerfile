# Stage 1 
FROM maven:3.6-jdk-8-alpine AS builder
RUN mvn -version

COPY . /usr/src/myapp/
WORKDIR /usr/src/myapp/
RUN mvn package

# Stage 2 
FROM openjdk:8-jre-alpine
WORKDIR /root/
COPY --from=builder /usr/src/myapp/target/showip.jar .

EXPOSE 8123
ENTRYPOINT ["java", "-jar", "./showip.jar"]