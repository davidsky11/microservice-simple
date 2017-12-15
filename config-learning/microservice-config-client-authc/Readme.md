优先级高：
spring:
  cloud:
    config:
      uri: http://localhost:8080
      username: user
      password: password123
      
优先级低：
spring:
  cloud:
    config:
      uri: http://user:password123@localhost:8080   # curl style   属性的优先级高于url