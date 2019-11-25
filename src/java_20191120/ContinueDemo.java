package java_20191120;

public class ContinueDemo {
	public static void main(String[] args){
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if(i==6) continue; //if else로도 할 수 있으나 문장이 길어질 때 사용
			sum += i;
			
		}
		System.out.println(sum);
		
		//if(true) return; // 밑 문장을 수행하고 싶지 않을 때
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j == 6) continue; // i*j 중 ㅓ=6 제외
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
		
		outter : 
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j==5) continue outter; 
				// 2*1=2...2*4=8, 3*1=3...3*4=12 로 가게 됨
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
				
	}

}
