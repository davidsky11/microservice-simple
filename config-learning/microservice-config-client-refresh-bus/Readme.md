依赖 MQ

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bus-amqp</artifactId>
</dependency>

使用 Docker 部署 
将Docker网络设置改为“CONNECT FROM HOST NETWORK”

刷新（半自动）：
$ curl.exe -X POST http://localhost:8081/bus/refresh

全自动可以结合 WebHook 实现。