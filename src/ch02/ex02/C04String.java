package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
//		String s = "|" + " a happy ".trim() + "|"; //.trim() 문자열의 공백을 제거한다. 
//		s = s.concat(" dog");					   // 거짓된 데이터를 참으로 바꿔준다.
//		//concat은 주어에 목적어를 붙이는 역할은 한다. (+)와 같은부분이다.
//		s = s.substring(2);
//		//substring은 지정한 ()안에 숫자수 만큼 지워준다.
//		System.out.println(s);
//		
//		s = "hello";
//		System.out.printf("%c\n" , s.charAt(1));
//		
		int i = "a".codePointAt(0);
		//codePointAt 은 해당 인덱스의 유니코드이다.
		i = "A".hashCode();
		//hashCode 도 해당 인덱스의 유니코드이다.
//		i = "b".hashCode();
//		i = "c".compareTo("a");
//		i = "a".compareTo("b");
//		i = "A".compareTo("a");
//		//"".compareTo(index) index안에와 ""의 간격을 비교하여 숫자로 나타낸다.
//		i = "A".compareToIgnoreCase("a");
//		//.compareToIgnoreCase 대소 문자를 무시하고 논리적인 값을 구하고싶을때 사용한다.
//		i = s.indexOf("l");
//		//첫번째 l의 index를 출력한다 ("hello")
//		i = s.lastIndexOf("l");
//		i = s.length();
		//문자의 길이를 나타낸다.
		System.out.println(i);
		
//		s = "develop";
//		boolean b = s.startsWith("de");
//		b = s.endsWith("lop");
//		//내가 지정한 값의 시작과 끝이 맞는지 확인 할때 사용한다.
//		b = s.equals("develop");
//		b = s.equals("Develop");
//		//s.equals() 괄호안이 같은지 true false로 알려준다.
//		b = s.equalsIgnoreCase("Develop");
//		//s.equalsIgnoreCase 대소문자를 구분하지않는다.
//		b = "".isEmpty();
//		b = s.matches("[a-zA-Z]*");
//		b = s.matches("[0-9]*");
//		//s.matches("[]*") 괄호안에 값이 true인지 false인지 알려준다. 
//		System.out.println(b);
	}
}
