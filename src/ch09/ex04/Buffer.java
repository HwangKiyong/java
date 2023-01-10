package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait(); //기다리는 것이다. sleep은 아니다.
			}
		}
	}
}
 /*
wait();	기다리는 것이다. sleep은 아니다.
*/