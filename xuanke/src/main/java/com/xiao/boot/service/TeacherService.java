package com.xiao.boot.service;

import com.xiao.boot.bean.Course;
import com.xiao.boot.bean.Student;
import com.xiao.boot.bean.Teacher;
import com.xiao.boot.bean.User;

import java.util.List;
import java.util.Map;

public interface TeacherService {

    public int addCourse(Course course);    //移交给管理员

    public Teacher findTeacherById(String id);  //改名

    public int updateSelfInfo(Teacher teacher);

    public List<Map<String,Object>> findAllCourseByTeacherId(String id);//删除

    public List<Student> findStudents(String teacherId);

}
