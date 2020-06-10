package com.hc.test2.service.impl;

import com.hc.bean.Dept;
import com.hc.test2.mapper.DeptMapper2;
import com.hc.test2.service.DeptService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HC on 2018/4/22.
 */
@Service
public class DeptService2Impl implements DeptService2 {

    @Autowired
    private DeptMapper2 deptMapper2;


    @Override
    public Dept addDept(Dept dept) {
        deptMapper2.insert(dept);
        return dept;
    }

    @Override
    public List<Dept> getAllDept() {
        return deptMapper2.selectAllDept();
    }
    
}
