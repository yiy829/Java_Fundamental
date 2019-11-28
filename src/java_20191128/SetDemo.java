package java_20191128;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// HashhSet은 데이터(객체)의 중복을 허용하지 않고, 순서가 없음.
		HashSet set = new HashSet(); // Import 자동추가하려면 Ctrl+Shift+O
		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			set.add(random);
			if (set.size() == 6)
				break;
		}
		// set은 추출할수 있는 문법이 없으므로 Iterator 메서드를 사용해서 추출한다.
		Iterator i = set.iterator();
		while (i.hasNext()) {// hasNext() : HashSet에 출력 할 객체가 존재하는지 판단하는 메서드
			int temp = (Integer) i.next();// next() 해당 객체를 가져온다.
			System.out.print(temp + "\t");
		}
		
		// TreeSet은 데이터(객체)의 중복을 허용하지 않고, 출력시 오름차순 정렬된다.
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			set2.add(random);
			// add메서드를 사용하였을 때, overriding한 객체만 중복을 허용하지 않는다.
			if (set2.size() == 6)
				break;
		}
		// set은 추출할수 있는 문법이 없으므로 Iterator 메서드를 사용해서 추출한다.
		Iterator<Integer> i2 = set2.iterator(); //generic 덕에 캐스팅 안해도 됌.
		while (i2.hasNext()) {// hasNext() : HashSet에 출력 할 객체가 존재하는지 판단하는 메서드
			int temp2 = i2.next();// next() 해당 객체를 가져온다.
			System.out.print(temp2 + "\n");
		}
		
		HashSet<Test> s = new HashSet<Test>();
		s.add(new Test(10));
		s.add(new Test(20));
		s.add(new Test(10));
		
		System.out.println(s.size()+ "\n"); // 3개
			
	}
}


class Test{
	int a;
	Test(int a){
		this.a = a;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
}