高可用的Eureka服务：

需要修改 C:\Windows\System32\drivers\etc\hosts 中添加:
    127.0.0.1 peer1 peer2 peer3

报错：com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server

原因：在默认设置下，Eureka服务注册中心也会将自己作为客户端来尝试注册它自己，所以我们需要禁用它的客户端注册行为。

禁止方式如下：在application.yml中增加如下内容：
eureka:
    client:
        register-with-eureka: false
        fetch-registry: false