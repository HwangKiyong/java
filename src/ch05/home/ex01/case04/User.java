package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate joinDate;
				
	
	public void setUserName(String userName){ 
		this.userName = userName;		
	}

	public String getUserName() {
		return userName;
		
		
	} 
	
	public void setAge(int age) {
		this.age = age;
	}	
	
	public int getAge() {
		return age;
	}	
	
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	
	public LocalDate getJoinDate() {
		return joinDate = LocalDate.now();
	}	
}
