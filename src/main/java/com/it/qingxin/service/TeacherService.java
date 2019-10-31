package com.it.qingxin.service;

import com.it.qingxin.bean.Teacher;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 17:41
 */
public interface TeacherService {
    List<Teacher> getTeachers(String sub, String grade);

    Teacher getTeacherInfoByName(String name);

    List<Teacher> getTeachersBySub(String sub);
}
