package java_20191126.step2;

public class StopWatch {
	
	long startTime;
	long endTime;
	long startNanoTime;
	long endNanoTime;	
	
	//milli
	public void start(){
		startTime = System.currentTimeMillis();
	}
	
	public void stop(){
		endTime = System.currentTimeMillis();	
	}
	public double getElapsedMilliTime(){
		return(double)(endTime - startTime)/(double)1000;
	}
	
	
	//nano
	public void startNano(){ // 갯수가 다르면 자료형이 달라야 되는데 같으므로
		startNanoTime = System.nanoTime();
	}
	
	public void stopNano(){
		endNanoTime = System.nanoTime();	
	}
	public double getElapsedNanoTime(){
		return(double)(endNanoTime - startNanoTime)/(double)1000000000;
	}
}
