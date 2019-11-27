package java_20191127.step2;
//1. 팀장 : 실제 비지니스 로직이 있는 클래스와 실행되는 클래스를 분리해보자
//2. 시간을 측정하는 기능을 메소드로 추출
public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		
		s.startNano();
		for (long i = 0; i < 8000000000l; i++) {

		}
		s.stopNano();

		double elapsedTime = s.getElapsedNanoTime();
		
		System.out.printf("경과시간 : %.9f %n", elapsedTime);
	}
}
