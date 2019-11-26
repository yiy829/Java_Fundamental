package java_20191126.step5;

public class StopWatchDemo {
	public static void execute(StopWatch s) {
		s.run();
	}

	public static void main(String[] args){
		StopWatch s1 = new StopMilliWatch();
		execute(s1);
		
		StopWatch s2 = new StopNanoWatch();
		execute(s2); // 좋지만 문제의 소지가 많고 아직이다
		
		StopWatch s3 = new StopMicroWatch();
		execute(s3); 
		//우리가 할 수 있는 건 여기까지. 이후는 안배웠으나 demo2 로 저장
	}
}
