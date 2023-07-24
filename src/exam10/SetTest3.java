package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		//Set 계열 : 순서 없고, 중복 불가한 자료구조
		
//		HashSet<String> set = new HashSet<String>(); //뒤의 꺽쇠에는 타입 생략 가능
		HashSet<String> set = new HashSet<>(); //저장소 (바구니) 생성
		
		//가정 : 이름만 저장할 것이다.
		set.add("Kai");
		set.add("John");
		set.add("Kelly");
		
//		set.add(10); //잘못된 데이터를 컴파일 할 때 알 수 있음
		
		for (String obj : set) {
//			String str = (String)obj;
			System.out.println(">>"+obj.concat(" 님"));
		}
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println("%%"+str);
		}
		
		/*
		 * 제네릭을 쓰면
		 * 1) 잘못된 데이터 저장할 것을 컴파일 시점에 알 수 있다.
		 * 2) 형변환 필요 없다.
		 */

	}

}
