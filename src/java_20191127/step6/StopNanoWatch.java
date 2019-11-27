package java_20191127.step6;

public class StopNanoWatch extends StopWatch {
	private void start(){
		setStartTime(System.nanoTime());
	}
	private void stop(){
		setEndTime(System.nanoTime());
	}
	private double getElapsedTime() {
		return (double) (getEndTime() - getStartTime()) / (double) 1000000000;
	}
	
	public void run(){
		start();
		for (long i = 0; i < 8000000000l; i++) {

		}
		stop();

		double elapsedTime = getElapsedTime();

		System.out.printf("경과시간 : %.9f %n", elapsedTime);
	}
}
