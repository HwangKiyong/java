package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() { //run 메서드이지 thread 가 아니다.
		System.out.println(Thread.currentThread().getName() + " : start.");
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": "	+ c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}
		}
		
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}	
}
