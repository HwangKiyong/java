import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriterEx1 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaaaa.txt"));
		bw.write("hello\n");	//출력
		bw.newLine();	//개행 즉 엔터역할
		bw.write("I am writing\n"); 	//개행과 함께 출력
		bw.flush();	//남아 있는 데이터 출력
		bw.close(); //스트림
	}
}
