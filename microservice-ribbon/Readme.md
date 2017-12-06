负载均衡的自定义：

一、通过代码实现

    同时使用两种以上的不同策略算法：

    方法1：移除@Configuration注解

    方法2：指定@ComponentScan的扫描路径（默认是扫描主类下面所有的文件夹）

    方法3：把它移到主类的外面，让主类扫描不到

    说明：只要不让SpringContext扫描到即可。
    
二、通过配置文件实现

    # 设置策略
    microservice.ribbon.NFLoadBalancerRuleClassName=com.netflix.loadbalancer.RandomRule
    #microservice.ribbon.NFLoadBalancerRuleClassName=com.netflix.loadbalancer.RoundRobinRule
    
    说明：
    格式：应用名.ribbon.NFLoadBalancerRuleClassName=xxx
    

当内置的负载均衡策略不满足业务需求的时候，我们就需要自定义Ribbon的负载策略。