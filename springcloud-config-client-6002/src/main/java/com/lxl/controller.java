package com.lxl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/3 16:07
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class controller {

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;
    @GetMapping("/config")
    public String getConfig(){
        return "applicationName=" + applicationName + " " +
                "eurekaServer=" + eurekaServer + " " +
                "port=" + port;
    }

}
