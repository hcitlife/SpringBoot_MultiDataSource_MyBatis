package com.hc.test1.mapper;

import com.hc.bean.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class DeptMapper1Test {

    @Resource
    private DeptMapper1 deptMapper1;

    @Test
    public void insert() {
        Dept dept = new Dept(10, "aaa", "aaaaaaaa");
        deptMapper1.insert(dept);
        System.out.println(deptMapper1);
    }

    @Test
    public void selectAllDept() {
        List<Dept> depts = deptMapper1.selectAllDept();
        depts.forEach(System.out::println);
    }
}