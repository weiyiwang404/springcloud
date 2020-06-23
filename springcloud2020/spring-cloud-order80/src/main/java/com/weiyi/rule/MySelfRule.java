package com.weiyi.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName rule
 * @Description TODO
 * @Author 不如叫南安
 * @Date 2020/6/23 9:29
 * @Version 1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule () {
        return new RandomRule();
    }

}
