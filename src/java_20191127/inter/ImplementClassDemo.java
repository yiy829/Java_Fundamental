package java_20191127.inter;
/**
 이 클래스는 인터페이스를 테스트합니다.
 */
import java.util.*;
import java.sql.*;


public class ImplementClassDemo {
	/**
	이 메서드는 JVM 이 호출해주는 메서드입니다.
	 */
	public static void main(String[] args) {
		InterA/*Reference type*/ a = new ImplementClass();
		a.mA();
		a.mB();
		a.mC();
		//import 주의사항
		//Date d = new Date(); -> 오류
		java.util.Date d = new java.util.Date();
	}
}
