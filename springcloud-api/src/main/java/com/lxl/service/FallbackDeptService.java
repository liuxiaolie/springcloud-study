package com.lxl.service;

import com.lxl.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/2 20:31
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class FallbackDeptService implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
      return   new DeptService() {
            @Override
            public void addDept(Dept dept) {

            }

            @Override
            public Dept findById(Long id) {
                return Dept.builder().dName(id +" 该服务访问的服务器关闭了，进行降级访问").build();
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }
        };
    }
}
