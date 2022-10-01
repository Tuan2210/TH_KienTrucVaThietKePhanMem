#link tạo dockerfile: https://www.youtube.com/watch?v=_tqBIDSNWoY

FROM maven:latest
RUN mkdir /qlchuyenbay-spring-jpa-api
WORKDIR /qlchuyenbay-spring-jpa-api
COPY . .
EXPOSE 8080
#port của sping-boot container
CMD ["mvn", "spring-boot:run"]

#FROM openjdk:8
#COPY target/tuan05_Spring_Data_JPA_Docker_API.jar chuyenbay-spring-jpa-api.jar
#COPY . chuyenbay-spring-jpa-api.jar
#ENTRYPOINT ["java","-jar","/chuyenbay-spring-jpa-api.jar"]