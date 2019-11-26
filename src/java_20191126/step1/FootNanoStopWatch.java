package java_20191126.step1;
//1. 요구사항 : 밀리 세컨드로 경과 시간을 만들어 주세요...
//2. 요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요... 제발... (밀리 세컨트로 바꿔야 할 것 같다고 짱구굴림)
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	public double getElapsedMilliTime(){
		return(double)(endTime - startTime)/(double)1000;
	}
	
	public double getElapsedNanoTime(){
		return(double)(endNanoTime - startNanoTime)/(double)1000000000;
	}
	
	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		//1970년 1월 1일부터 지금까지 시간을 밀리세컨드로 변환
		//f.startTime = System.currentTimeMillis(); // 해당 서식이 long이기 때문에
		f.startNanoTime = System.nanoTime();
		
		for (long i = 0; i < 5000000000l; i++) {
			
		}
		
		// f.endTime = System.currentTimeMillis();
		f.endNanoTime = System.nanoTime();
		
		double elapsedTime = f.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}




