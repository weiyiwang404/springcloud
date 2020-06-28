package com.weiyi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain9001
 * @Description
 * @Author 不如叫南安
 * @Date 2020/6/28 9:56
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
    public static void main (String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}
