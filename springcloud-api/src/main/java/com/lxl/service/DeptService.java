package com.lxl.service;

import com.lxl.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/2 16:28
 * @description： hystrix 服务熔断：发生在服务端 ，作用于方法，当方法出现异常或者超时时调用备用方法以响应
 *                       服务降级  发生在客户端，作用于类，当服务端关闭是调用fallbackFactory指定的类
 * @modified By：
 * @version: $
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER",fallbackFactory = FallbackDeptService.class)
public interface DeptService {
    @PostMapping("/dept/addDept")
    public void addDept(Dept dept);

    @GetMapping("/dept/findById/{id}")
    public Dept findById(@PathVariable("id") Long id);
    @GetMapping("/dept/findAll")
    public List<Dept> findAll();
}
