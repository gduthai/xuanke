package com.xiao.boot.service;

import com.xiao.boot.bean.Course;
import com.xiao.boot.bean.Student;
import com.xiao.boot.bean.User;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public Student findStudentById(String id);

    public int updateSelfInfo(Student student);

    List<Map<String,Object>> findAllCourse();//改名

    List<Map<String,Object>> findChosenCourse(String studentId);//删除

    int chooseCourse(String courseId,String teacherId,String studentId);

    int updateCourseNum(String courseId);

}
