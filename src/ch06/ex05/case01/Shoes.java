package ch06.ex05.case01;

public class Shoes extends Product{
	private int price;
	
	public Shoes(int price) {
		super(price * 2);   //부모 class
		this.price = price; //자식 class
	}
	
	@Override
	public int getPrice() {		
		return super.getPrice();
	}
}
