package com.lxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/2 09:52
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain.class,args);
    }
}
