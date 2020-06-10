package com.hc.test1.service;

import com.hc.bean.Dept;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HC on 2018/4/22.
 */

public interface DeptService1 {

    Dept addDept(Dept dept);

    List<Dept> getAllDept();
}
