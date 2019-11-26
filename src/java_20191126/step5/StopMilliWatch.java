package java_20191126.step5;

public class StopMilliWatch extends StopWatch {
	
	private void start(){
		startTime = System.currentTimeMillis();
	}
	private void stop(){
		endTime = System.currentTimeMillis();	
	}
	private double getElapsedTime(){
		return(double)(endTime - startTime)/(double)1000;
	}
	public void run(){
		start();
		for (long i = 0; i < 5000000000l; i++) {

		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
