package com.weiyi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain9001
 * @Description TODO
 * @Author 不如叫南安
 * @Date 2020/6/28 9:56
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {
    public static void main (String[] args) {
        SpringApplication.run(PaymentMain9001.class, args);
    }
}
