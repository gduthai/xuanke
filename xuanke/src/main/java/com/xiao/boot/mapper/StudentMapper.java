package com.xiao.boot.mapper;

import com.xiao.boot.bean.Course;
import com.xiao.boot.bean.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    public Student findStudentById(String id);  //可以不要  修改名称

    public int updateSelfInfo(Student student);  //修改名称

    List<Map<String,Object>> findAllCourse();   //实现

    List<Map<String,Object>> findChosenCourse(String studentId);//修改名称

    int chooseCourse(String courseId,String teacherId,String studentId);//选课

    int updateCourseNum(String courseId);
}
