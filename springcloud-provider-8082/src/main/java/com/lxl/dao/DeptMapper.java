package com.lxl.dao;

import com.lxl.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：liuxiaolie
 * @emial ：liuxiaolie@mskj.com
 * @date ：Created in 2021/2/1 19:47
 * @description：
 * @modified By：
 * @version: $
 */
@Mapper
@Repository
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
