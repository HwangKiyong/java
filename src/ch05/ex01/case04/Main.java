package ch05.ex01.case04;

public class Main {
	public static void main(String[] agrs) {
		User user = new User();
		user.setUserName("최한석"); //참된 데이터는 출력한다.
		user.setUserName("한아름");	//거짓된 데이터는 차단한다.
		
		System.out.println(user.getUserName());
	}
}
