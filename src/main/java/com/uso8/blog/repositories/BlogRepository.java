package com.uso8.blog.repositories;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BlogRepository {

    @Select("select * from blogs")
    List<BlogEntity> findAll();

    @Insert("insert into blogs (title, article) values (#{title}, #{article})")
    void insert(String title, String article);

    @Select("select * from blogs where id = #{blogID}")
    BlogEntity findById(long blogId);

}
