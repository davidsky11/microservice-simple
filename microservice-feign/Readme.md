声明式客户端Feign

    Feigh是一种声明式、模板化的HTTP客户端，在Spring Cloud中使用Feign，
    可以做到使用HTTP请求远程服务时能与调用本地方法一样的编码体验，
    开发者完全感知不到这是远程方法，更感知不到这是个HTTP请求。
    
    Feign的灵感来源于Retrofit、JAXRS-2.0和WebSocket，它使得Java HTTP客户端编写更方便，
    旨在通过最少的资源和代码来实现和HTTP API的连接。
    
引入

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-feign</artifactId>
    </dependency>
    
    说明：里面的jar包含有spring-cloud-starter-ribbon，是基于Ribbon来实现的
    
使用

    添加注解
    @EnableFeignClients
    
默认配置

    Spring Cloud Netflix提供的默认实现类：FeignClientsConfiguration
    解码器：Decoder feignDecoder: ResponseEntityDecoder (which wraps a SpringDecoder)
    编码器：Encoder feignEncoder: SpringEncoder
    日志框架：Logger feignLogger: Slf4jLogger
    契约：Contract feignContract：SpringMvcContract
    生成器：Feign.Builder feignBuilder：HystrixFeign.Builder
    
    说明：
    解码器的作用：将HTTP响应数据反序列化为Java对象
    编码器的作用：将方法签名中方法参数对象序列化为请求参数放到HTTP请求中

    
    