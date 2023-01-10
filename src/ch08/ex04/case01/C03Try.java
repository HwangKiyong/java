package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			if(out != null) out.close();
		}
	}
}

//PrintWriter 콘솔이 아닌 파일을 출력장치로 쓰겠다.
/*try catch 는 한구문에서만 실행이 된다.
finally 구문은 try catch에 상관없이 무조건 실행된다.
*/