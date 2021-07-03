package com.xiao.boot.mapper;

import com.xiao.boot.bean.Course;
import com.xiao.boot.bean.Student;
import com.xiao.boot.bean.Teacher;
import com.xiao.boot.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// @Mapper 如果开启了包扫描就不用写注解了
public interface AdminMapper {

    public Integer addTeacher(Teacher teacher);

    public Integer addStudent(Student student);

    public Integer addCourse(Course course);
    public Integer addUser(User user);

    public List<Student> queryALLStudents();

    public List<Teacher> queryALLTeachers();

    public List<User> queryAllUsers();
}
