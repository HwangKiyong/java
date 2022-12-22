package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";
		
		s = new String("a");
		System.out.println(s);
		b = s =="a";
		
		b = s.equals("a");
		/*상수로 만들었는지 new 란 API로 만들었는지 정확히 모를때는
		.equals로 비교하는것이 좋다.*/
		System.out.println(b);
	}
}
