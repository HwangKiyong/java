package ch09.ex03;

public class Player extends Thread {
	private Counter counter;
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease();
			
			if(i % 10 == 0 ) counter.print();
			
			try {
				Thread.sleep((int)(Math.random()* 2));
			} catch(InterruptedException e) {}
		}
	}
}
//Thread 메서드에는 run 메서드가 이미 준비되어있다.