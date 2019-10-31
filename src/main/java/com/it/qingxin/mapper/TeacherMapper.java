package com.it.qingxin.mapper;

import com.it.qingxin.bean.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author wjh
 * @create 2019-09-03 17:19
 */
@Mapper
public interface TeacherMapper {
    //    @Select("select * from teacher where teach_sub = #{sub} and grade = #{grade}")
    List<Teacher> getTeachers(@Param("sub") String sub, @Param("grade") String grade);

    Teacher getTeacherInfoByName(String name);

    List<Teacher> getTeachersBySub(String sub);
}