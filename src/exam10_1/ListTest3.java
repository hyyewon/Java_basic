package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		//List 계열 : 순서가 있고 중복이 가능
		//배열과 유사해서 인덱스 이용 가능
		ArrayList<String> list = new ArrayList<>(); //다형성
		
		list.add("Jack");
		list.add("Kelly");
		list.add("Sam");
		list.add("Jack");
		
		System.out.println(list);
		
		//일반적으로 많이 사용하는 방법
		List<String> list2 = Arrays.asList("Jack","Kelly","Sam","Jack");
		System.out.println(list2);
		
		/*
		 * 	Arrays API
		 * 	1)Arrays.toString(배열);
		 * 	2)Arrays.asList(값,값2,값3,...);
		 * 
		 */
		

	}

}
