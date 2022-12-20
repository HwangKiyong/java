package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // parameter(매개변수)
		System.out.println(score); //variable
		System.out.println(100 + 1); // expression 은 데이터를 표현하는것이다.
		System.out.println(Math.random()); // method  random = 0.0이상 1.0 미만의 값을 랜덤하게 리턴한다
		
		System.out.print(200);
		System.out.print(300); //줄바꿈을 하고 싶지 않으면 print 를 사용하면된다.
		System.out.print('\n'); //'' = char  "" = String 이다.
		System.out.print(400);
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n", true,'a',10,1.15,"hello");  //separator
		/*%b= boolean 출력 %d =정수형 출력 , %c =문자열출력 %f =실수형 출력 %s\n 문자형 줄바꿔출력*/
		// 과제 : 위 출력문에서 구분자로 / 를 사용하라.
		System.out.printf("%b/%c/%d/%f/%s\n", true,'a',10,1.15,"hello");
		
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156,"hello");  // -를 사용하게 되면 왼쪽정렬된다.
		
		String name = "최한석";
		int age =22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다."); //snippet 코드조각 , concatenate
	}
}