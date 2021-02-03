package com.lxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：liuxiaolie
 * @emial ：liuxiaolie@mskj.com
 * @date ：Created in 2021/2/3 15:30
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer_6001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_6001.class,args);
    }
}
