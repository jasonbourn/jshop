package com.jason.gateway.config;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * @author Levin
 * @date 2017-08-14.
 */
@Component
public class GatewayZuulFallback implements FallbackProvider {
    @Override
    public String getRoute() {
        return "battcn-hello-service";//指定回退的服务名
    }

    @Override
    public ClientHttpResponse fallbackResponse(String s, Throwable throwable) {
        return null;
    }
}