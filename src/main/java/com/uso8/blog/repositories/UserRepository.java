package com.uso8.blog.repositories;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserRepository {

    @Select("select * from users where username = #{username}")
    Optional<UserEntity> findByUsername(String username);

}
