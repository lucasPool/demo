package edu.nju.TrainingCollege.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "ClassesMapper")
public interface ClassesMapper {
    @Select("select count(*) from classes where courseid = #{courseid}")
    int selectByCourseid(@Param("courseid") int courseid);

    @Insert("insert into classes (orderid, courseid, semail) values(#{orderid}, #{courseid}, #{semail})")
    int insertClass(@Param("orderid") int orderid, @Param("courseid") int courseid, @Param("semail") String semail);
}