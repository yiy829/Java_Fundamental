package java_20191120;

public class WhileDemo {
	public static void main(String[] args) { // 자동 만들기 main ctrl+space+enter
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 100까지 합은 %,d 입니다.", sum); // %,d는 3자리 단위로 ,를 찍어줌
		
		//While문으로 구구단
		int first = 2;
		while (first <= 9) {
			
			int second = 1; // while문 바로 위에 해야
			while(second <= 9){
				
				System.out.printf("%d * %d = %d%n", first, second, first*second);
				
				second++;
			}
			
			first++;   // 이런식으로 쓰지말고 외부소스에서 건드리는 경우에만 사용해라
		}
	}
}
