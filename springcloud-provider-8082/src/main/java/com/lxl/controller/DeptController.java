package com.lxl.controller;

import com.lxl.entity.Dept;
import com.lxl.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/1 19:58
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;
    @Autowired
    DiscoveryClient client;

    @PostMapping("/dept/add")
    public void addDept(Dept dept){
        deptService.addDept(dept);

    }
    @GetMapping("/dept/findById/{id}")
    @HystrixCommand(fallbackMethod = "hystrixFind")
    public Dept findById(@PathVariable("id") long id){
        Dept dept = deptService.findById(id);
        if (dept == null){
            throw new RuntimeException("不存在该部门");
        }
        return dept;

    }
    //备选方案
    public Dept hystrixFind(@PathVariable("id") long id){
       return Dept.builder().dbSource("").dName("不存在该部门").build();

    }
    @GetMapping("/dept/findAll")
    public List<Dept> findAll(){
        return deptService.findAll();

    }
    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER");
        instances.forEach(item ->{
            System.out.println(item.getHost() +" " + item.getPort() + " " + item.getUri());
        });
        return instances;
    }
}
