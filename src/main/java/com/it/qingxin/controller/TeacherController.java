package com.it.qingxin.controller;

import com.it.qingxin.bean.Teacher;
import com.it.qingxin.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 17:43
 */
@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    /**
     * 查找教师
     *
     * @param sub
     * @param grade
     * @return
     */
    @RequestMapping("/getSelectTeach")
    @ResponseBody
    public String getSelectTeach(String sub, String grade) {
        String result = "";
        System.out.println(sub);
        System.out.println(grade);
        List<Teacher> teachers = teacherService.getTeachers(sub, grade);
        System.out.println("查询的结果:");
        if (teachers.isEmpty()) {
            result = "error";
        } else {
            for (Teacher teacher : teachers) {
                result += teacher.getTeachName() + ",";
            }
            System.out.println("result:" + result);
        }
        return result;
    }

    /**
     * 根据教师姓名获取教师信息
     *
     * @param name
     * @return
     */
    @RequestMapping("/getTeacherInfo")
    @ResponseBody
    public String getTeacherInfo(String name) {
        System.out.println("查询姓名:" + name);
        String result = "";
        Teacher teacher = teacherService.getTeacherInfoByName(name);
        if (teacher != null) {
            return teacher.getTeachSex() + "," + teacher.getTeachePhonenum() + "," + teacher.getTeachAddress() + "," + teacher.getTeachExper() + "," + (teacher.getTeachIcon() == null ? "" : teacher.getTeachIcon());
        } else {
            return "";
        }
    }

    /**
     * 根据课程名查找该课程的所有教师
     *
     * @param subjectName
     * @return
     */
    @RequestMapping("/getTeach")
    @ResponseBody
    public String getTeachersBySub(String subjectName) {
        String result = "";
        List<Teacher> teachersBySub = teacherService.getTeachersBySub(subjectName);
        if (teachersBySub.isEmpty()) {
            result = "error";
        } else {
            for (Teacher teacher : teachersBySub) {
                result += "教师：" + teacher.getTeachName() + "   " + "任课年级：" + teacher.getGrade() + ",";
            }
        }
        return result;
    }
}