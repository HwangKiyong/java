package ch07.ex02.dao;

import ch07.ex02.domain.User;

public interface UserDao {	//User 도메인명이다.
	public User selectUser();  //유저 데이터를 읽는것이다.
}


//dao 에서는 interface를 먼저 만들어야한다.