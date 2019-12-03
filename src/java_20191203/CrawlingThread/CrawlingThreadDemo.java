package java_20191203.CrawlingThread;

public class CrawlingThreadDemo {
	public static void main(String[] args) {
		CrawlingThread c1 = new CrawlingThread("bitcoin.txt");
		c1.start();
	}
}
