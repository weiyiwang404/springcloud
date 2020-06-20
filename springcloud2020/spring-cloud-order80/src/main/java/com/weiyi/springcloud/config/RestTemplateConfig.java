package com.weiyi.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/20 12:23
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate myRestTemplate(){
        return new RestTemplate();
    }
}
