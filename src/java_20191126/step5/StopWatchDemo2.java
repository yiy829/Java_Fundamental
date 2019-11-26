package java_20191126.step5;

public class StopWatchDemo2 {
	public static void execute(StopWatch s) {
		s.run();
	}

	public static void main(String[] args)throws Exception {
		String input = args[0];
		input = "java_20191126.step5."+input;
		
		//java reflection 현업에서도 쓸일이 거의 없다..
		StopWatch s1 = (StopWatch)Class.forName(input).newInstance(); // 자바 리플렉션 : 문자열을 통해 객체생성 (패키지명 + 클래스명이 나와야 가능)
		
		execute(s1);
	}
}
