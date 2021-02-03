package com.lxl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：liuxiaolie
 * @emial ：liuxiaolie@mskj.com
 * @date ：Created in 2021/2/1 19:23
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dept implements Serializable {
    private static final long serialVersionUID = -4917086401285826597L;
    private Long deptNo;
    private String dName;
    private String dbSource;
}
