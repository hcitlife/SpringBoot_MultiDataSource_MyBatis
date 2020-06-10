package com.hc.test2.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DeptMapper2Test {

    @Resource
    private DeptMapper2 deptMapper2;

    @Test
    void insert() {

    }

    @Test
    void selectAllDept() {
        deptMapper2.selectAllDept().forEach(System.out::println);
    }
}