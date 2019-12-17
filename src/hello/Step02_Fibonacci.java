package hello;

public class Step02_Fibonacci {
   
   public static int[] getFibonacci(int size) {
      int[] array = new int[size];
      // 크기를 입력받아 피보나치 수열을 반환해주세요
      // 피보나치 수열은 현재값과 다음항의 값의 합이 다다음항의 값이 되는 것입니다.
      // ex> 1 1 2 3 5 8 ...
      // 1항과 2항은 각각 1로 넣어주세요
      array[0] = 1;
      array[1] = 1;
      
     for (int i = 0; i < array.length; i++) {
    	 if(i<=1){
    		 array[i] = 1;
    	 }else{
    		 array[i] = (array[i-2] + array[i-1]);
    	 }
	} 
      return array;
   }
   
   
   public static void main(String[] args) {
      
      int[] fibonacci = getFibonacci((int)(Math.random()*25+5));
      	
      for (int i = 0; i < fibonacci.length; i++) {
         System.out.printf("%d ", fibonacci[i]);
      }
   }
}