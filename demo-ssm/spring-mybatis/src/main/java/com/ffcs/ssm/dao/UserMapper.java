package com.ffcs.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ffcs.ssm.dao.entity.User;

@Repository
public interface UserMapper {
	List<User> selectUsers();

	int insertUser(User user);

	int updateUser(Long id,String userName);

	int deleteUser(@Param("id") Long id);
}
