package ch07.ex03;

import ch07.ex02.presentation.Console;
import ch07.ex03.dao.UserDao;
import ch07.ex03.dao.UserDaoImpl;
import ch07.ex03.presentation.UserIo;
import ch07.ex03.sevice.UserService;
import ch07.ex03.sevice.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.play();
		Console.info("end.");
	}
}


