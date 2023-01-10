package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});	
		
		Thread thread2 = new Thread(() ->{
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();	//작동하는 일이 많기 때문에 메인스레드보다 늦게 출력된다.
		thread2.start();	//thread1 과 thread2를 시간을 쪼개가면서 병렬처리한다.
		
		System.out.println("main end.");
	}
}

//메인 스레드가 시작했고 끝났다는걸로 생각해야된다.

//Web app 에는 multi thread 가 필수이다.