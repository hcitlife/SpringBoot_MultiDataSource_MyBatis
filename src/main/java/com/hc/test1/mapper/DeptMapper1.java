package com.hc.test1.mapper;

import com.hc.bean.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by HC on 2018/4/22.
 */
@Mapper
public interface DeptMapper1 {

    @Insert("insert into tb_dept(dname,loc) values(#{dname},#{loc})")
    void insert(Dept dept);

    @Select("select * from tb_dept")
    List<Dept> selectAllDept();

}
