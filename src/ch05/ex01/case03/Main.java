package ch05.ex01.case03;

public class Main {
	public static void main(String[] agrs) {
		User user = new User();
		//user.userName private로 지정을 하면 사용할수 없다. 
		
		user.setUserName("최한석");//String "" <- ""안에는 상수이다.  최한석은 상수이다.
		user.setAge(12);
		
		user.setUserName("한아름");
		user.setAge(43);
		
		System.out.printf("%s, %d\n",user.getUserName(), user.getAge());
	}
}
