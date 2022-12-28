package ch05.ex03.case01;

public class Tv {
	private String color;
	private boolean power;
	private int channer;
	
	public String getColor() {
		return color;
	}
	
	public boolean isPower() { // boolean 타입은 is로 시작하는것이 관례이다.
		return power;
	}
	
	public int getChanner() {
		return channer;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void setChanner(int channer) {
		this.channer = channer;
	}
	
	
}
