package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.sleep(pajamas);
		man.sleep(pajamas); //위 strip wash wear lie 를 sleep으로 묶어서 사용이가능하다.
		
	}
}
