package java_20191126.step3;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopNanoWatch s = new StopNanoWatch();
		s.start();
	for (long i = 0; i < 5000000000l; i++) {
			
		}
		s.stop();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}
