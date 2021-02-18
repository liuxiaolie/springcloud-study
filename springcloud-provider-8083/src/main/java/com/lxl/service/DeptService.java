package com.lxl.service;

import com.lxl.entity.Dept;

import java.util.List;

/**
 * @author ：liuxiaolie
 * @date ：Created in 2021/2/1 19:56
 * @description：
 * @modified By：
 * @version: $
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
