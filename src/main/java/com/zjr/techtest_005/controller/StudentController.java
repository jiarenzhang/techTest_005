package com.zjr.techtest_005.controller;

import com.zjr.techtest_005.domain.Student;
import com.zjr.techtest_005.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/save")
    public Student save(Student student) throws SQLException {
        student.setAge(11);
        student.setCreateTime(new Date());
        student.setName("张三");
        student.setRemark("备注");
        studentService.save(student);
        return student;
    }

    @RequestMapping(value = "/update")
    public Student update() throws SQLException {
        Student student = new Student();
        student.setId(196L);
        student.setRemark("我是170");
        student.setCreateTime(new Date());
        student.setName("170名字");
        student.setAge(12);
        studentService.update(student);
        return student;
    }
    @RequestMapping(value = "/s")
    public Student selectOne() throws SQLException {
        Student student = new Student();
        student.setId(200L);

        student  = studentService.selectOne(student);
        return student;
    }
    @RequestMapping(value = "/ls")
    public List<Student> selectAll() throws SQLException {

        List<Student> students = studentService.selectAll();
        return students;
    }
    @RequestMapping(value = "/d")
    public Student delete() throws SQLException {
        Student  student  = new Student();
        student.setId(197L);
        studentService.delete(student);
        return student;
    }
}
