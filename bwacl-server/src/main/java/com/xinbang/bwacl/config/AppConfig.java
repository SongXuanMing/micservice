package com.xinbang.bwacl.config;

import com.xinbang.bwacl.common.constant.SERVICE_CONSTANT;
import moxie.cloud.service.client.ClientFactory;
import moxie.cloud.service.client.discovery.ConsulDiscoveryService;
import moxie.cloud.service.client.discovery.DiscoveryService;
import moxie.cloud.service.server.ServiceInfo;
import moxie.cloud.service.server.config.AbstractConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sxm on 17/2/9.
 */
@Configuration
public class AppConfig extends AbstractConfig {
    @Override
    public String getServiceName() {
        return "bwaclservice";
    }

    @Override
    public String getUserAgent() {
        return "bwacl service";
    }

    @Override
    public String getMetricsNamespace() {
        return "bwaclservice";
    }

    @Override
    public ServiceInfo getServiceInfo() {
        return new ServiceInfo("黑白名单授权中心", "黑白名单授权中心管理", SERVICE_CONSTANT.SERVICE_NAME, "v1");
    }

    @Bean
    public DiscoveryService discoveryService() {
        return new ConsulDiscoveryService();
    }

    @Bean
    public ClientFactory.Options httpOptions() {
        return new ClientFactory.Options() {
            @Override
            public String userAgent() {
                return getUserAgent();
            }

            @Override
            public long connectTimeout() {
                return 5000;
            }

            @Override
            public long readTimeout() {
                return 5000;
            }

            @Override
            public long maxConnections() {
                return 50;
            }

            @Override
            public long maxConnectionsPerRoute() {
                return 100;
            }
        };
    }
}
