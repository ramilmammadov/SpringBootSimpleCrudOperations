# Spring-Boot-Simple-Crud-Operations
With this repo you will learn simple crud operations on MYSQL db with Spring Boot.

# application.properties configuration
  
*Change application.properties values for your mysql server.*

spring.datasource.url=jdbc:mysql://localhost:3306/springtest\
spring.datasource.username=root\
spring.datasource.password=123456\
spring.datasource.driver-class-name = com.mysql.jdbc.Driver\
spring.jpa.hibernate.ddl-auto=update\
spring.jpa.show-sql=true

# Insert User
*METHOD:*&nbsp;&nbsp; POST \
*URL:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/addUser \
*JSON:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ```{  
"id":1, 
"name":"Ramil Mammadov",  
"email":"ramilmammadov95@gmail.com"  
}```

# Get User List
*METHOD:*&nbsp;&nbsp; GET \
*URL:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/users 

# Update User
*METHOD:*&nbsp;&nbsp; PUT \
*URL:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/updateUser \
*JSON:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ```{
"id":1,
"name":"Vuqar Suleymanov",
"email":"vuqar.suleymanov.94@gmail.com"
}```

# Delete User
*METHOD:*&nbsp;&nbsp; DELETE \
*URL:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;http://localhost:8080/updateUser \
*JSON:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ```{
"id":1,
"name":"Vuqar Suleymanov",
"email":"vuqar.suleymanov.94@gmail.com"
}```
