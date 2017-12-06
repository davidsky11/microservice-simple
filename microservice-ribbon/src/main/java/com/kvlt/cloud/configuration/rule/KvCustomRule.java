package com.kvlt.cloud.configuration.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * KvCustomRule
 * 自定义Ribbon的负载均衡策略
 * @author KVLT
 * @date 2017-11-27.
 */
public class KvCustomRule extends AbstractLoadBalancerRule {

    private Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }

            List<Server> upList = lb.getReachableServers();  // 可用的服务实例

            // 只获取端口为：7779的服务实例
            for (Server s : upList) {
                if (server.getPort() == 7779) {
                    server = s;
                }
            }

            if (server == null) {
                Thread.yield();
                continue;
            }

            System.out.println("实例IP：" + server.getHost() + " 端口：" + server.getPort());

            if (server.isAlive()) {
                return (server);
            }

            server = null;
            Thread.yield();
        }

        return server;
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }

}

