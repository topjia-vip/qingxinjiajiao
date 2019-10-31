package com.it.qingxin;

import com.it.qingxin.bean.Parent;
import com.it.qingxin.bean.Teacher;
import com.it.qingxin.mapper.LoginMapper;
import com.it.qingxin.mapper.RegisterMapper;
import com.it.qingxin.mapper.TeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QingxinApplicationTests {
    @Autowired
    LoginMapper loginMapper;
    @Autowired
    RegisterMapper registerMapper;
    @Autowired
    TeacherMapper teacherMapper;

    @Test
    public void s() {
        Parent parentByPhone = loginMapper.getParentByPhone("15202355582");
        System.out.println(parentByPhone);
    }

    @Test
    public void testinsert() {
        List<Teacher> teachers = teacherMapper.getTeachers("chinese", "高三");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

}
