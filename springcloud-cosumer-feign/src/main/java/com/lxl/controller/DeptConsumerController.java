package com.lxl.controller;

import com.lxl.entity.Dept;
import com.lxl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    DeptService deptService;
//    private RestTemplate restTemplate;
//    private final static String URL = "http://SPRINGCLOUD-PROVIDER/";
    @PostMapping("/consumer/dept/addDept")
    public void addDept(Dept dept){
        deptService.addDept(dept);
    }
    @GetMapping("/consumer/dept/findById/{id}")
    public Dept findById(@PathVariable("id") Long id){
           return deptService.findById(id);
    }
    @GetMapping("/consumer/dept/findAll")
    public List<Dept> findAll(){
        return deptService.findAll();
    }
}
