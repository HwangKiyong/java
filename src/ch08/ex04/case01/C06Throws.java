package ch08.ex04.case01;

public class C06Throws {
	/*
	public void first() {
		this.second();
	}
	
	public void second() {
		this.third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	*/
	
	public void first() {
		this.second();
	}
	
	public void second() {
		try {
			this.third();
		} catch(Exception e) {}	
	}
	
	public void third() throws Exception{
		int i = 3 / 0;
	}
	public static void main(String[] args) {
		new C06Throws().first();
		System.out.println("end.");
	}
}


//메소드 선언부에서 throw 쓰게되면 try 를 강제로 써야한다.