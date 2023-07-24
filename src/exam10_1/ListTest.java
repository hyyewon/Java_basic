package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		//List 계열 : 순서가 있고 중복이 가능
		//배열과 유사해서 인덱스 이용 가능
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Jack");
		list.add("Kelly");
		list.add("Sam");
		list.add("Jack");
		
		System.out.println(list); //[Jack, Kelly, Sam, Jack]
		
		for (String str : list) {
			System.out.println(">>"+str);
		}
		
		Iterator<String> ite = list.iterator(); 
		while(ite.hasNext()) {
			System.out.println("##"+ite.next());
		}
		
		Iterator<String> ite2 = list.iterator(); 
		while(ite2.hasNext()) {
			String x = ite2.next();
			System.out.println("%%"+x);
		}
		
		//출력방법4 - index 이용, list.get(idx)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		

	}

}
