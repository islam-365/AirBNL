FROM openjdk:8
EXPOSE 8060
ENV mysql_url=//http:localhost
ENV mysql_port=3306
ENV mysql_database_name=AirBNL
ENV mysql_username=root
ENV mysql_password=root
COPY target/DBController.jar DBController.jar
CMD ["java", "-jar", "DBController.jar"]
