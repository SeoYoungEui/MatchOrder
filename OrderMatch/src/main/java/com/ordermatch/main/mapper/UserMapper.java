package com.ordermatch.main.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ordermatch.main.user.model.User;

public interface UserMapper {
	//모든 유저 조회
	List<User> selectAllUser();
	//id값으로 단건 유저 조회
	Optional<User> findById(int id);
	//아이디로 유저조회
	Optional<User> findByUsername(String username);
	//유저 정보 추가
	int insertUser(User user);
	//유저 권한 추가
	int insertRole(HashMap<String, String> map);
	//유저 정보 수정
	int updateUser(User user);
	//유저 삭제
	int deleteUser(int id);
	
	//현재시각
	String getNow() throws Exception;
}
