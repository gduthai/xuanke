package com.xiao.boot.service;

import com.xiao.boot.bean.Course;
import com.xiao.boot.bean.Student;
import com.xiao.boot.bean.Teacher;
import com.xiao.boot.bean.User;

import java.util.List;

public interface AdminService {

    public Integer addTeacher(Teacher teacher);

    public Integer addStudent(Student student);

    public Integer addCourse(Course course);

    public Integer addUser(User user);

    public List<Student> queryALLStudents();

    public List<Teacher> queryALLTeachers();

    public List<User> queryAllUsers();

}
