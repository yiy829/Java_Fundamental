package java_20191120;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			
			if (i == 5) break; // 5에서 빠져 나가고 싶을 때
		}
		System.out.println(sum);

		//구구단 응용
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j==9) break; // 2*9, 3*9, .. , 9*9 를 없애고 싶을 때
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
		
		outter : for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i==4 && j==9) break outter; 
				// 4*9에서부터! 빠져나가고 싶을때(outter 이름은 임의 지정)
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
	}
}
