package com.lxl.service.impl;

import com.lxl.dao.DeptMapper;
import com.lxl.entity.Dept;
import com.lxl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/1 19:57
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;
    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
