package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold" -> coupon = "5만원";
		case "silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		}
		
		switch(grade) { //괄호 안의 데이터 타입과 case에 데이터타입이 같아야한다.(int 면 int String 이면 String)
		case "gold", "silver" -> coupon = "5만원";	 //case 안에 n개의 값을 줄수있다	
		default -> coupon = "1천원";
		}
		
		System.out.println(coupon);
	}
}
