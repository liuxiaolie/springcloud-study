package com.lxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/2 21:22
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableHystrixDashboard // 开启监控
public class HystrixDashboardMain {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain.class,args);
    }
}
