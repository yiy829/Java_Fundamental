package java_20191202;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;

	// public void run(){
	public synchronized void run() {
		// t1, t2가 같은 객체를 공유하면 제어권을 안뺏기게 함
		synchronized (SynchronizedDemo.class) { // 위와 해당줄 2가지 방법이 있음
			for (int i = 0; i < 1000; i++) {
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.printf("x : %d, y : %d - %s%n", x, y, threadName);
				// 임계영역(Critical Section) : 한번 제어권을 가지면 중간에 뺏기지 않게하는 영역
			}
		}
	}

	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		// Thread t2 = new Thread(s2);
		// 인스턴스 변수를 공유하다보니 x,y 값이 2000까지 나옴
		// 객체를 공유하면 큰 오류가 날 수 있다.
		// 예측을 할 수 없으니 조심해야..

		t1.start();
		t2.start();

		while (true) {

			try {
				Thread.sleep(5000); // 1000=1초동안 block과 같은 기능을 시켜줌
				// 주기적으로 어떤 메서드를 실행해야 할때 사용
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Thread(s1).start();
		}

	}
}
