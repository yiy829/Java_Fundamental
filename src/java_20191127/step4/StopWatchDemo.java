package java_20191127.step4;

//1. 실제 비지니스 로직을 메서드로 분리하자
public class StopWatchDemo {
	public void execute(StopNanoWatch s) {
		s.start();
		for (long i = 0; i < 8000000000l; i++) {

		}
		s.stop();

		double elapsedTime = s.getElapsedTime();

		System.out.printf("경과시간 : %.9f %n", elapsedTime);

	}
	
	public void execute(StopMilliWatch s) {
		s.start();
		for (long i = 0; i < 5000000000l; i++) {

		}
		s.stop();

		double elapsedTime = s.getElapsedTime();

		System.out.printf("경과시간 : %.3f %n", elapsedTime);

	}

	public static void main(String[] args) {
		StopWatchDemo swd = new StopWatchDemo(); // static이 아닌 instance 이기 때문에 
		StopNanoWatch s1 = new StopNanoWatch();
		swd.execute(s1);
		
		StopMilliWatch s2 = new StopMilliWatch();
		swd.execute(s2);

	}
}
