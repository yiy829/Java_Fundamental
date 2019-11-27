package java_20191127.step6;

//1. 모든 클래스의 Encapsulation
//2. 메인 클래스의 Java Reflection 추가
public class StopWatchDemo {
	public void execute(StopWatch s) { 
		s.run();
	}

	public static void main(String[] args) throws Exception {
		// Java Reflection
		String input = args[0];
		String className = "java_20191127.step6." + input;
		StopWatch s = (StopWatch)Class.forName(className).newInstance(); 
		// forName : 메모리에 로딩. newInstance : 객체화.
		// 매번 바꾸지 않기 위해 3개의 부모인 StopWatch로 자동캐스팅
		// => 문자열로 되있는 해당 클래스를 객체화 시키는 방
		StopWatchDemo swd = new StopWatchDemo(); 
		swd.execute(s);
		
		
	}
}
