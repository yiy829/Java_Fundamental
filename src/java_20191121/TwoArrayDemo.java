package java_20191121;

public class TwoArrayDemo {
	public static void main(String[] args){
		int [][] a = new int [3][2] ;
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;
		
		int[][] b = {{10,20}, {30,40}, {50,60}};
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		// each문으로 결과창 출력
		for (int[] i : b) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			
			
			System.out.println();
		}
		
		
		int[][] c = {{1}, {2,3}, {4,5,6}};
		
		int[][] d = new int[3][];
		d[0] = new int[1];
		d[1] = new int[2];
		d[2] = new int[3];
		d[0][0] = 1;
		d[1][0] = 2;
		d[1][1] = 3;
		d[2][0] = 4;
		d[2][1] = 5;
		d[2][2] = 6;
		
		for(int i=0; i<d.length; i++){
			for(int j=0; j<d[i].length; j++){   // 무조건 3열까지 있는 거싱 아니므로 d[i]의 길이만큼으로 써주기
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Primitive 는 참조가 없고 해당 값을 바로 대입하지만 Reference는 참조가 가능하다.
	}
}
