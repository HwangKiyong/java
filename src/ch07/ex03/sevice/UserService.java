package ch07.ex03.sevice;

import ch07.ex03.domain.User;

public interface UserService {
	public User getUser();	//리드는 get
	public void addUser(User user);	//추가는 add
	public void fixUser(String userName);	//수정은 fix
	public void delUser();	//삭제는 del
}
