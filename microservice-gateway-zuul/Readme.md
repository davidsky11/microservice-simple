Zuul 网关

主类 添加 @EnableZuulProxy 

eureka
    microservice-provider-user:7901
    /simple/{id}
  
zuul
    localhost:ZUUL_PORT/microservice-provider-user/simple/{id}
    
    

所有微服务不使用反向代理
zuul:
    ignoredServices: '*'  # 正则表达式
    ignoredServices: microservice-provider-user, microservice-consumer-movie-ribbon-with-hystrix
    
某些微服务使用反向代理
zuul:
    routes:
        microservice-provider-user: /user/**