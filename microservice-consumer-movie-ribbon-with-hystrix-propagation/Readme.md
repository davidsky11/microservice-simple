主应用：  @EnableCircuitBreaker

@HystrixCommand(fallbackMethod = "findByIdFallback")
实现 fallbackMethod 输入参数、输入参数要一致

http://localhost:8010/hystrix.stream

状态查看:
http://localhost:8010/health