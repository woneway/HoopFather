package com.woneway.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.woneway.domain.User;

@Component
@Mapper
public interface UserMapper {
	
	@Select("select * from site_user where userName=#{userName}")
	public User getByName(@Param("userName") String userName);
	
	@Select("select * from site_user")
	public List<User> getAllUser();
	
	@Select("select * from site_user where userEmail=#{userEmail} and userPwd=#{userPwd}")
	public User login(@Param("userEmail") String userEmail,@Param("userPwd") String userPwd);

	@Insert("INSERT INTO `site_user` (`userName`, `userAddr`, `userEmail`, `userState`, `userCode` ,`userPwd`) "
			+ "VALUES(#{userName},#{userAddr},#{userEmail},#{userState},#{userCode},#{userPwd})")
	public int register(User user);

	@Select("select * from site_user where userCode=#{userCode}")
	public User getByUserCode(String userCode);

	@Update("update site_user set userCode = #{userCode} , userState = #{userState} where userId =#{userId}")
	public void updateUserInfo(User user);
}
