package com.weiyi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderMain90
 * @Description TODO
 * @Author 不如叫南安
 * @Date 2020/6/28 10:10
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain90 {
    public static void main (String[] args) {
        SpringApplication.run(OrderMain90.class, args);
    }
}
