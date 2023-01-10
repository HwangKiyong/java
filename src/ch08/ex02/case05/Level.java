package ch08.ex02.case05;

public enum Level {
	GOLD(3, null), SILVER(2, GOLD), COOPER(1, SILVER); 

	private final int value;
	private final Level next;
	
	private Level(int value, Level next) {
		this.value = value;
		this.next = next;
	}
	
	public int value() {
		return this.value;
	}
	
	public Level next() { //record를 흉내낸것
		return this.next;
	}
}

//enum에 생성자는 private여야된다. 외부에서 만들면 안된다.