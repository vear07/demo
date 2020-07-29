package com.ffcs.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.ffcs.ssm.dao.entity.User;

@Repository
public interface UserDao {
	
	@Select("select * from user_tbl where username= #{username}")
	List<User> selectUsers(String username);
}
