package ch07.ex06.case05;

public class Cabinet<T extends A> { //A이하를 상속받는다.	super가 있으면 이상이다.
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
}
