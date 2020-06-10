package com.hc.Controller;

import com.hc.bean.Dept;
import com.hc.test1.service.DeptService1;
import com.hc.test2.service.DeptService2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by HC on 2018/4/23.
 */
@RestController
@RequestMapping("/dept")
public class DeptController implements Serializable {

    @Resource
    private DeptService1 deptService1;

    @Resource
    private DeptService2 deptService2;

    @RequestMapping("/test1/insert/{dname}/{loc}")
    public Dept insert1(@PathVariable("dname")String dname,@PathVariable("loc")String loc){
        Dept dept = new Dept(dname, loc);
        deptService1.addDept(dept);
        return dept;
    }

    @RequestMapping("/test2/insert/{dname}/{loc}")
    public Dept insert2(@PathVariable("dname")String dname,@PathVariable("loc")String loc){
        Dept dept = new Dept(dname, loc);
        deptService2.addDept(dept);
        return dept;
    }

    @RequestMapping("/test1/getAllDept")
    public List<Dept> getAllDept1(){
       return deptService1.getAllDept();
    }

    @RequestMapping("/test2/getAllDept")
    public List<Dept> getAllDept2(){
        return deptService2.getAllDept();
    }

}
