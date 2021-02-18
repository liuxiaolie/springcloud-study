package com.lxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/2 09:52
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain.class,args);
    }
}
