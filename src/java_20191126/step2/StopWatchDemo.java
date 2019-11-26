package java_20191126.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		s.start();
	for (long i = 0; i < 5000000000l; i++) {
			
		}
		s.stop();
		double elapsedTime = s.getElapsedMilliTime();
		System.out.printf("경과시간 : #.3f", elapsedTime);
	}
}
