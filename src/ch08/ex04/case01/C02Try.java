package ch08.ex04.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error.");
		}
			
		System.out.println("end.");
	}
}

//try catch 는 VM에게 예외처리를 하지 않고 내가 하는것이다.