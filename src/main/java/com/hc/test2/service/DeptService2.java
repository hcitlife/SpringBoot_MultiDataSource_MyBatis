package com.hc.test2.service;

import com.hc.bean.Dept;

import java.util.List;

/**
 * Created by HC on 2018/4/22.
 */

public interface DeptService2 {

    Dept addDept(Dept dept);

    List<Dept> getAllDept();
}
