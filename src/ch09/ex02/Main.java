package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start");
		//이 메서드를 call한 메서드를 가져 오는것이다.
		Thread counter = new Thread(new Counter()); //이렇게 지정해줘야 thread가 되는 것이다.
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) {
			if(tries <= 2) {
				counter.join(1000);
				System.out.println(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt(); //thread 를 깨우는것
				counter.join(); //thread를 기다린다.
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
