package com.zjr.techtest_005.service;

import com.zjr.techtest_005.domain.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: ZhangJiaRen
 * @Date: Created in 19:33 2018/1/25
 * @Description:
 */
public interface IStudentService {

    void save(Student student) throws SQLException;

    void update(Student student) throws SQLException;

    Student selectOne(Student student) throws SQLException;

    List<Student> selectAll() throws SQLException;

    void delete(Student student) throws SQLException;

}