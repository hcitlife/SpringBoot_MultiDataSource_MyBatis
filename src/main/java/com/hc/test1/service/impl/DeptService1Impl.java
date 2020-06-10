package com.hc.test1.service.impl;

import com.hc.bean.Dept;
import com.hc.test1.mapper.DeptMapper1;
import com.hc.test1.service.DeptService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HC on 2018/4/22.
 */
@Service
public class DeptService1Impl implements DeptService1 {

    @Autowired
    private DeptMapper1 deptMapper1;


    @Override
    public Dept addDept(Dept dept) {
        deptMapper1.insert(dept);
        return dept;
    }

    @Override
    public List<Dept> getAllDept() {
        return deptMapper1.selectAllDept();
    }

}
