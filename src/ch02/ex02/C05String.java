package ch02.ex02;

public class C05String {
	public static void main(String[] args) {
		// text block
		String comment = """
				이 식당에 방문하길 잘했네요.
				"참 맛있다." 
				라는 말이 절로 나오네요.
				""";
		//""" """; 은 문장을 쓸때 사용한다. ""일반문자로 취급된다
		System.out.println(comment);
		
		String color ="""
				red
				green
				blue
				""";
		System.out.println(color);
		
		color = """
				red  \s
				green\s
				blue \s
				""";
		System.out.println(color);
		//space(띄워쓰기)를 사용하고 싶으며 \s 를 사용하면된다.
		String type = "int";
		String code = """
				public void print(""" + type + """
				 val)
				 System.out.println(val);
				)""";
		System.out.println(code);
		//p를 기준으로 정렬하는것이다.
		code = """
				<html>
					<body>
						<p>Hello, Java</p>
					</body>
				</html>""";	
		System.out.println("|" + code + "|");
	}
}
