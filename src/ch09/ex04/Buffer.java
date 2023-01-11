package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait(); //기다리는 것이다. sleep은 아니다.
			} catch(InterruptedException e) {}			
		}
		
		int val = this.val;
		this.val = null;		
		notifyAll();
		
		return val;
	}
	
	public synchronized void add(Integer val) {
		while(this.val != null) {
			try {
				wait(); //생상자는 값이 있으면 wait 한다.
			} catch(InterruptedException e) {}		
		}

		this.val = val;
		notifyAll();		
	}
}
 /*
wait(); = 기다리는 것이다. sleep은 아니다. Object 클래스에 속한다.
sleep(); thread 클래스에 속한다
*/