package ch07.ex03.dao;

import ch07.ex02.domain.User;

public interface UserDao {
	public User selectUser();
	public void insertUser(User user);
	public void updateUser(String userName);
	public void deleteUser();
	
}
