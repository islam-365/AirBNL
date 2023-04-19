# AirBNL
Hotel Booking System

Overview
The objective of this project is to design and develop an online 
hotel reservation system. 

The System developed using java and spring boot with intelij.

# System Design

The system designed and developed using a microservices 
architecture to facilitate scalability and maintainability, the 
system has 4 services and a database; Authentication Service, 
Manager Service, Hotel Service, and Database Controller 
Service. Each works on a specific port, the first three services 
communicate with the Database Controller and the database 
controller communicate with the database that is in our case a 
MySql database. 
We will use Java and Spring Boot to design the system.

![image](https://user-images.githubusercontent.com/85651011/233060177-276553b0-4047-4756-b297-ad192fac1028.png)

- Authentication service: it’s the service that is responsible 
for authenticate the users log in information

![image](https://user-images.githubusercontent.com/85651011/233060367-cc0a0d82-caa7-44cf-a92d-f21bc37deac2.png)

-	Hotel Service: it’s the service that the normal user will interact with to search, Book rooms, and monitoring their reservation.
![image](https://user-images.githubusercontent.com/85651011/233060457-7999a1a0-487e-4b52-890e-06baa57938a3.png)

-	Manager Service: that’s the service that the managers access to register their hotels on the system.
![image](https://user-images.githubusercontent.com/85651011/233060508-73ebbe2a-3c65-424c-b56b-591b12bf18e3.png)

-	Database Controller: it’s the service responsible of create, update, read, and delete data from the database.
![image](https://user-images.githubusercontent.com/85651011/233060580-bed0294d-508d-4b8e-9cff-17dc386e3bfc.png)

-	Database: it’s a usual MySql Database containing all the tables of data we use in the system. 
![image](https://user-images.githubusercontent.com/85651011/233060637-50d0fbc8-5239-4b02-8cff-4f7bf2a1a0ea.png)

# Run the System Natively

First, we will run the system natively.
we will run the services one by one from the project or using jar files

![image](https://user-images.githubusercontent.com/85651011/233060728-0a725317-04b9-45d2-92a0-8b7cf8f652c3.png)
![image](https://user-images.githubusercontent.com/85651011/233060765-0231e149-b85c-400c-8778-33d642a448e8.png)

Here we can see that the System is running and we are able to log in
![image](https://user-images.githubusercontent.com/85651011/233060815-c3480a53-97ee-4915-8d5d-3b28d0c3ed73.png)
![image](https://user-images.githubusercontent.com/85651011/233060855-2dd8e886-37f7-478f-9269-2bb23ba1ac49.png)

*Note: for the site to log in and work, you have to run some quires on the database
Sample quires you can find on the DBController in the path:
src/main/resources/static/initial_data.sql  
![image](https://user-images.githubusercontent.com/85651011/233060924-c744d776-b3e1-4f8f-91b0-1b4d43bbe512.png)

Running the System with Docker

Here we will use Docker files to create an image for each of the Services we have, then run the hole system with docker compose.
Starting with the authentication Docker file

![image](https://user-images.githubusercontent.com/85651011/233060992-2f07f31a-7815-4cbf-8b2c-941f1c79575f.png)
Here we use the java image "openjdk:8" to run the container exposing on port 8070 that our service working on, then set some environment variables for it to see the other services and then copy the jar file on the target folder to the container and finally run a command to start the service.

*Note: make sure to install the jar file for each service first before running the docker file or the docker compose.

![image](https://user-images.githubusercontent.com/85651011/233061049-1ef69584-0b19-4189-9fbc-4946fb6a2f47.png)

Moving on to The Hotel Service
![image](https://user-images.githubusercontent.com/85651011/233061106-c35af9fb-b7f6-453c-ae10-317e1b177831.png)
Its almost the same as the Authentication service, except for the port and environment variables 

The same is here also for the Manager Service
![image](https://user-images.githubusercontent.com/85651011/233061149-4ff94bd0-f6dd-48f3-a07a-11f36fc6ee02.png)

Finally, we have the Database Controller
![image](https://user-images.githubusercontent.com/85651011/233061199-03853f88-b1b7-41cf-b92e-40dbb02cf1bb.png)

Here, additionally to the previous mentioned, we will add environment variables to connect to the database, such as;
Database url, port number, user name and password, and of course the database name.

# Docker Compose file

to make the things easier for us handling all these containers at once, we will use docker compose file.
![image](https://user-images.githubusercontent.com/85651011/233061308-ec49a8f9-db7c-4307-a802-0b32db76a8db.png)

Here we have the first service that is the MySql database.
Using the "mysql:8" image, specify the network, ports, volume to save the data from losing, and environment variables to set the root password and database name.
Running the docker compose 
Now for starting the system, we will use the "docker-compose up" to start the system.
![image](https://user-images.githubusercontent.com/85651011/233061419-f35050d8-d061-4b4e-8ce7-c38bba40e356.png)
![image](https://user-images.githubusercontent.com/85651011/233061435-66ee84d1-ad38-47b5-91ee-7877e255c777.png)
![image](https://user-images.githubusercontent.com/85651011/233061451-f1a9786e-5a60-4f74-8dd4-f1cc0cbdd40a.png)
![image](https://user-images.githubusercontent.com/85651011/233061463-b91835b9-6b27-49e7-8c83-931fcd4c60dd.png)


