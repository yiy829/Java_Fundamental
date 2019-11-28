package java_20191128;

import org.omg.Messaging.SyncScopeHelper;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		//StringBuffer 클래스는 Object의 equals() 메서드를 overriding 하지않았기
		//때문에 String Buffer에 equals()를 사용하면 false가 반환된다.
		//callbyRef로 하면 바뀌어 있음
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1); 
		//=> 패키지명@.. 가 안나오고 overriding으로 안에있는 문자열이 나옴.
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3.equals(s4)); 
		
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = '성영한' ");
		sql.append("order by name desc "); 
		System.out.println(sql);
		//이렇게 해도 String Buffer 객체 1개만 만들어진다.
		
		
		sql.setLength(0); //sql의 모든 문자열 지우기		
		sql.append("select no, writer");
		sql.append("from board");
		System.out.println(sql);
		
		
		
		
	}

}
