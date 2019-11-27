package java_20191127.step5;

public abstract class StopWatch {
	long startTime;
	long endTime;
	public abstract void run(); 
	// public void run(){} 해보기
	// 어느 누구도 비어있는 메소드를 만드는 사람이 없다. 추상화를 하게 되면 강제성이 띄게 되어 overriding을 해야한다
}
