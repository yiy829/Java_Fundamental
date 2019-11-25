package java_20191125;

import java.lang.reflect.Array;

public class MethodDemo {
	public int plus(int first, int second){//int first, int second => 매개변수(Parmeter)
		return first + second;
	}
	
	public double divide(int first, int second){
		return(double)first / (double)second;
	}
	
	public int[] ascending(int[] array){
		for(int i=0; i < array.length; i++){
			for(int j=0; j < array.length - (i+1); j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public boolean isLeafYear(int year){
		return  year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	public void print(String str){
		System.out.print(str);
	}
	public static void main(String[] args){
		MethodDemo md = new MethodDemo();
		
		int temp = md.plus(10, 20); //10, 20 => 전달인자(Argument)
		
		System.out.println(temp);
		
		double temp2 = md.divide(22, 5);
		
		System.out.println(temp2);
		
		int[] temp4 = {1, 42, 45, 3, 10, 9, 80, 34};
		
		int[] temp5 = md.ascending(temp4);
		
		for (int value : temp5) {
			System.out.print(value + "\t");
		}
		
		boolean temp6 = md.isLeafYear(2019);
		if(temp6){
			System.out.println("윤년");
		}else{
			System.out.println("평년");
		}
		
		md.print("월요일 입니다.");
	
	}
}


