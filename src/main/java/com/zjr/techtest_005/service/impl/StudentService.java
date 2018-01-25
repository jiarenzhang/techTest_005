package com.zjr.techtest_005.service.impl;

import com.zjr.techtest_005.domain.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Service
public class StudentService {

    private static final  Logger  LOG = LoggerFactory.getLogger(StudentService.class);
    @Resource
    private QueryRunner queryRunner;

    public  void  save(Student student) throws SQLException {

         queryRunner.insert("INSERT   INTO   student (age,name,remark,createTime)  VALUES (?,?,?,?)",new BeanHandler<>(Student.class),student.getAge(),
                 student.getName(),student.getRemark(),student.getCreateTime());

    }
    public   void  update(Student student) throws SQLException {
        queryRunner.update("UPDATE  student  SET  age=?,name=?,remark=?,createTime=?  WHERE  id=?",student.getAge(),
                student.getName(),student.getRemark(),student.getCreateTime(),student.getId());
    }

    public  Student  selectOne(Student  student) throws SQLException {
        return  queryRunner.query("SELECT  *  FROM  student  WHERE id=?",new BeanHandler<>(Student.class),student.getId());
    }
    public List<Student> selectAll() throws SQLException {

        return  (List<Student>) queryRunner.query("SELECT  *  FROM  student",new BeanListHandler<>(Student.class));
    }
    public  void delete(Student student) throws SQLException{

            queryRunner.update("delete from student where id=?", student.getId());

    }
}
