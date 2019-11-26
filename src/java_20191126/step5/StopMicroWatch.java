package java_20191126.step5;

public class StopMicroWatch extends StopWatch {
	
	public void start(){ // 갯수가 다르면 자료형이 달라야 되는데 같으므로
		startTime = System.nanoTime();
	}
	public void stop(){
		endTime = System.nanoTime();	
	}
	public double getElapsedTime(){
		return(double)(endTime - startTime)/(double)1000000000;
	}
	public void run(){
		start();
		for (long i = 0; i < 5000000000l; i++) {

		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.6f", elapsedTime);
	}

}
