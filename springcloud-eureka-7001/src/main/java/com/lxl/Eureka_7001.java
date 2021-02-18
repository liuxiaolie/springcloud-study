package com.lxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/2 10:18
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7001.class,args);
    }
}
