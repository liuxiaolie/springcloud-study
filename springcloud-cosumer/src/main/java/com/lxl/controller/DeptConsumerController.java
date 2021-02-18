package com.lxl.controller;

import com.lxl.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/2 09:34
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class DeptConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    private final static String URL = "http://SPRINGCLOUD-PROVIDER/";
    @PostMapping("/consumer/dept/addDept")
    public void addDept(Dept dept){
        restTemplate.postForObject(URL+"/dept/addDept/",dept,null);
    }
    @GetMapping("/consumer/dept/findById/{id}")
    public Dept findById(@PathVariable("id") Long id){
           return restTemplate.getForObject(URL+"/dept/findById/" + id,Dept.class);
    }
    @GetMapping("/consumer/dept/findAll")
    public List<Dept> findAll(Dept dept){
        return restTemplate.getForObject(URL+"/dept/findAll/", List.class,dept);
    }
}
