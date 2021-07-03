package com.xiao.boot.service;

import com.xiao.boot.bean.Student;
import com.xiao.boot.bean.Teacher;

import java.util.List;

public interface AdminService {

    public Integer addTeacher(Teacher teacher);

    public Integer addStudent(Student student);

    public List<Student> queryALLStudents();

    public List<Teacher> queryALLTeachers();


}
