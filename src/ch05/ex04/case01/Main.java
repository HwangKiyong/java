package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d\n", Card.width , Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
//		Card.kind;  kind의 변수가 없기 때문에 사용이안된다.
//		Card.number; number의 변수가 없기 때문에 사용이안된다.
		//Card.kind,Card.number는 instance variable 이다 
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, card1.width, card1.height);//위험한 코드이다.
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height); //코드는 이렇게 사용해야한다.
		//static variable 은 static. 으로 사용하면된다.
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, card2.width, card2.height);
	}
}

//lock(잠그다) , queue(줄을서다)   -- lock과 queue 를 잘 구별해야한다.
