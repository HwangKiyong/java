package ch07.ex03.sevice;

import ch07.ex02.domain.User;

public interface UserService {
	public User getUser();
	public void addUser(User user);
	public void fixUser(String userName);
	public void delUser();
}
