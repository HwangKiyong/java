package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too long.";
		};
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "I don`t know.";}
		case 2 -> {
			String message = comment + " is good.";
			yield message;   //논리를 쓰고싶을때 블록을 쓰고 블록을 쓸때는 yield를 써야한다.
		}
		default -> {yield comment + " is too long.";}
		};
		System.out.println(msg);
		
		// yield 는 키워드가 아니다. 제한자이다.
		int yield = 1;
		System.out.println(yield);
//		int switch = 1;
	}
}
