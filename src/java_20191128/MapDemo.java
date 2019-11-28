package java_20191128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		//HashMap : key 값은 반드시 유일해야 하고, value에는 데이터(객체)을 저장하는데
		//데이터의 중복을 허용한다. key같이 중복되는 경우는 덮어쓰기를 한다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("1", 11111); //add는 특성상 2가지이상 넣기 때문에 put 사용
		map.put("2", 22222);
		map.put("3", 33333);
		map.put("4", 44444);
		map.put("5", 55555);
		map.put("1", 66666); // 꺼내보면 66666으로 저장.
		
		Integer value = map.get("1");
		System.out.println(value);
		// 통상적으로 게임 첫번째 로비에선 map을 사용해서 value 값을 아이디로 지정, 방들어가면 list를 사용함(방안엔 사람이 많지 않으니까)
		
		//map의 key값을 갖고와서 Set에 저장하겠다. key : 중복X, set : 중복X => 딱 들어 맞다
		Set<String> set = map.keySet();
		Iterator<String> i = set.iterator();
		while(i.hasNext()){
			String k = i.next();
			Integer v = map.get(k);
			System.out.format("key : %s, value : %d%n", k,v);
			
		}
	}
}
