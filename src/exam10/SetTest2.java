package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest2 {

	public static void main(String[] args) {
		//Set 계열 : 순서 없고, 중복 불가한 자료구조
		
		HashSet set = new HashSet(); //저장소 (바구니) 생성
		
		//가정 : 이름만 저장할 것이다.
		set.add("Kai");
		set.add("John");
		set.add("Kelly");
		
		set.add(10);
		
		for (Object obj : set) {
			String str = (String)obj;
			System.out.println(">>"+str.concat(" 님"));
		}
		/*
		 * 제네릭을 쓰지 않으면
		 * 1) 잘못된 데이터 저장할 것을 실행시점에 알 수 있다.
		 * 2) 무조건 형변환이 필요하다.
		 */

	}

}
