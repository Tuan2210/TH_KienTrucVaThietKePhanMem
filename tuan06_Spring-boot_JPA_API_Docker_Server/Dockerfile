#link tạo dockerfile: https://www.youtube.com/watch?v=_tqBIDSNWoY

FROM maven:latest
RUN mkdir /qlchuyenbay-spring-jpa-api
WORKDIR /qlchuyenbay-spring-jpa-api
COPY . .
EXPOSE 8081
#port của sping-boot container
CMD ["mvn", "spring-boot:run"]


#   ===> Update source code vào imamge & container của docker <===
# B1: cd đến container: docker exec -it 08402283732d bash (084...732d là id của container)
# B2: stop container chứa image tuan05_spring_data_jpa_docker_api_server
# B3: chạy 2 lệnh: (xem port 8080 ở container, tên tag ở image)
#	- docker run -dp 8080:8080 tuan05_spring_data_jpa_docker_api_server   
#	- docker run -dp 3307:3307 qlchuyenbay-spring-jpa-api