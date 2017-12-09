Zuul 网关 —— 正则表达式

主类  

1、添加 @EnableZuulProxy 

2、添加

    // 将 microservice-provider-user-v1 映射成 /v1/microservice-provider-user/
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }
