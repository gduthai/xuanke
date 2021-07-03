package com.xiao.boot.mapper;

import com.xiao.boot.bean.Course;
import com.xiao.boot.bean.Student;
import com.xiao.boot.bean.Teacher;
import com.xiao.boot.bean.User;

import java.util.List;
import java.util.Map;

public interface TeacherMapper {

    public int addCourse(Course course);

    public Teacher findTeacherById(String id);//修改名称

    public int updateSelfInfo(Teacher teacher);//修改名称

    public List<Map<String,Object>> findAllCourseByTeacherId(String id);//修改名称

    public List<Student> findStudents(String teacherId);//修改名称

}
