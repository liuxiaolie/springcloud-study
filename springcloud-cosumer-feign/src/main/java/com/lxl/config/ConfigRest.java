package com.lxl.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：liuxiaolie
 * @emial ：liuxiaolie@mskj.com
 * @date ：Created in 2021/2/2 09:31
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
public class ConfigRest {

    @Bean
    @LoadBalanced
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
