package com.it.qingxin.service.impl;

import com.it.qingxin.bean.Teacher;
import com.it.qingxin.mapper.TeacherMapper;
import com.it.qingxin.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 17:42
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getTeachers(String sub, String grade) {
        return teacherMapper.getTeachers(sub, grade);
    }

    @Override
    public Teacher getTeacherInfoByName(String name) {
        return teacherMapper.getTeacherInfoByName(name);
    }

    @Override
    public List<Teacher> getTeachersBySub(String sub) {
        return teacherMapper.getTeachersBySub(sub);
    }

}
