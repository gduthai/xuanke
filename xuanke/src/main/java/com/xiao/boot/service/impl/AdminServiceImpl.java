package com.xiao.boot.service.impl;

import com.xiao.boot.bean.Course;
import com.xiao.boot.bean.Student;
import com.xiao.boot.bean.Teacher;
import com.xiao.boot.bean.User;
import com.xiao.boot.mapper.AdminMapper;
import com.xiao.boot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Override
    public Integer addTeacher(Teacher teacher) {
        return adminMapper.addTeacher(teacher);
    }

    @Override
    public Integer addStudent(Student student) {
        return adminMapper.addStudent(student);
    }
    @Override
    public Integer addCourse(Course course){return adminMapper.addCourse(course);}

    @Override
    public Integer addUser(User user){return adminMapper.addUser(user);}

    @Override
    public List<Student> queryALLStudents(){return adminMapper.queryALLStudents();}

    @Override
    public List<Teacher> queryALLTeachers(){return adminMapper.queryALLTeachers();}
    @Override
    public List<User> queryAllUsers(){return adminMapper.queryAllUsers();}
}
