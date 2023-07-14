package exam03;

import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ArrayTest10 {

	//기본형 데이터 (call by value(기본값)로 전달. 값이 복사되기 때문에 원본값은 변경되지 않는다.)
	public static void pdt(int n) {
		System.out.println("pdt:"+n);
		n=20;
	}
	
	//참조형 데이터
	public static void rdt(int [] x) {
		System.out.println("rdt:"+Arrays.toString(x));
		x[0] = 100;
	}
	
	public static void main(String[] args) {

		int n = 10;
		System.out.println("호출전 n값:" + n); // 10
		pdt(n);
		System.out.println("호출후 n값:" + n); // 10
		
		int [] x = {10,20,30};
		System.out.println(Arrays.toString(x));
		rdt(x);
		System.out.println(Arrays.toString(x));
		
	}
}
