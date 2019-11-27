package java_20191127;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		// 자바 1.4이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에 
		// primitive data type을 객체화 할 수 있는 Wrapper Class로 변환하여 저장해야 한다. 
		ArrayList list = new ArrayList(); // ctrl + space 로 자동 유틸적용
		list.add(new Integer(1));
		list.add(new Integer(2));
		
		Integer i1 = (Integer)list.get(0);
		Integer i2 = (Integer)list.get(1);
		
		int a = i1.intValue() + i2.intValue(); // 1.4버전으로 해도 되는 코드
		
		//java 1.5 or java 5.0 이후
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		// Integer만 사용가능하게 했기때문에 디폴트로 지정됌 다만 해당 구간엔 객체만 삽입가능
		list1.add(1); //auto-boxing
		list1.add(2);//auto-boxing
		
		Integer i3 = list1.get(0);
		Integer i4 = list1.get(1);
		
		int b = i3 + i4; // auto-unboxing
		
		String str = "" + 10; // 저급한 방법..
		String str2 = String.valueOf(10); // 우아한 방법
		
		//문자열을 int로 바꿀 때 사용
		int d = Integer.parseInt("100");
		System.out.println(d);
		
	}
}
