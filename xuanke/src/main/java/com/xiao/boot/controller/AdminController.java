package com.xiao.boot.controller;

import com.xiao.boot.bean.Course;
import com.xiao.boot.bean.Student;
import com.xiao.boot.bean.Teacher;
import com.xiao.boot.bean.User;
import com.xiao.boot.mapper.AdminMapper;
import com.xiao.boot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;
    @GetMapping("/add_teacher_page")
    public String add_teacher_page(){
        return "admin/addTeacherPage";
    }

    @GetMapping("/add_student_page")
    public String add_student_page(){
        return "admin/addStudentPage";
    }

    @GetMapping("/add_course_user_page")
    public String add_course_page(){
        return "admin/addCoursePage";
    }

    @GetMapping("/add_user_page")
    public String add_user_page(){
        return "admin/addUserPage";
    }

    @PostMapping("/admin/add_teacher")
    public String addTeacher(Teacher teacher, RedirectAttributes ra){
        Integer row = adminService.addTeacher(teacher);
        if (row == 1){
            ra.addAttribute("message","添加成功");
        }else {
            ra.addAttribute("message","添加失败");
        }
        return "redirect:/add_teacher_page";
    }

    @PostMapping("/admin/add_student")
    public String addStudent(Student student, RedirectAttributes ra){
        Integer row = adminService.addStudent(student);
        if (row == 1){
            ra.addAttribute("message","添加成功");
        }else {
            ra.addAttribute("message","添加失败");
        }
        return "redirect:/add_student_page";
    }

    @PostMapping("/admin/add_course")
    public String addCourse(Course course, RedirectAttributes ra){
        course.setNum(0);
        Integer row = adminService.addCourse(course);
        if (row == 1){
            ra.addAttribute("message","添加成功");
        }else {
            ra.addAttribute("message","添加失败");
        }
        return "redirect:/add_course_user_page";
    }

    @PostMapping("/admin/add_user")
    public String addUser(User user, RedirectAttributes ra){
        Integer row = adminService.addUser(user);
        if (row == 1){
            ra.addAttribute("message","添加成功");
        }else {
            ra.addAttribute("message","添加失败");
        }
        return "redirect:/add_user_page";
    }

    @GetMapping("/show_all_student_page")
    public String queryALLStudent(HttpSession session, Model model){
        List<Student> students = adminService.queryALLStudents();
        if (students.size() == 0){
            model.addAttribute("message","没有学生");
            return "main";
        }
        model.addAttribute("students",students);
        return "admin/showAllstudentPage";
    }

    @GetMapping("/show_all_teacher_page")
    public String queryALLTeachers(HttpSession session, Model model){
        List<Teacher> students = adminService.queryALLTeachers();
        if (students.size() == 0){
            model.addAttribute("message","没有老师");
            return "main";
        }
        model.addAttribute("students",students);
        return "admin/showAllTeacherPage";
    }

    @GetMapping("/show_all_user_page")
    public String queryALLUsers(HttpSession session, Model model){
        List<User> students = adminService.queryAllUsers();
        if (students.size() == 0){
            model.addAttribute("message","没有用户");
            return "main";
        }
        model.addAttribute("students",students);
        return "admin/showAllUserPage";
    }




}
