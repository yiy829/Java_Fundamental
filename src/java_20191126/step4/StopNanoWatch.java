package java_20191126.step4;

public class StopNanoWatch {
	private long startTime;
	private long endTime;
	public void start(){ // 갯수가 다르면 자료형이 달라야 되는데 같으므로
		startTime = System.nanoTime();
	}
	
	public void stop(){
		endTime = System.nanoTime();	
	}
	public double getElapsedTime(){
		return(double)(endTime - startTime)/(double)1000000000;
	}

}
