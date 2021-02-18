package com.lxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/1 20:02
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
public class    ProviderMain_8083 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain_8083.class,args);
    }
}
