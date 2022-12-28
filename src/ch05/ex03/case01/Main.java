package ch05.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv(); //객체지향에서 가장 먼저해야됨 new 객체생성
		System.out.println(myTv);		
				
		myTv.setColor("red");
		myTv.setPower(true);
		myTv.setChanner(7);
		
		System.out.printf("%s, %b , %d\n",
				myTv.getColor(),myTv.isPower(),myTv.getChanner());
	}
}
