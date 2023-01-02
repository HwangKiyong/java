package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		//this.citrusName = "레드향";  이런식으로 사용되면 중복이된다.
		this("레드향"); //this 는 대명사이다.
	}
	//뭔가 생성 하나라도 쓰면 기본생성자가 자동으로 안써진다.
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}
}
