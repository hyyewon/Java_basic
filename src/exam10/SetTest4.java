package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest4 {

	public static void main(String[] args) {
		//Set 계열 : 순서 없고, 중복 불가한 자료구조
		//정수만 저장 ==> Wrapper클래스로 사용해야 함
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(10); //오토박싱
		set.add(20); //오토박싱
//		set.add("halo"); //에러
		
		//출력방법1 - toString()
		System.out.println(set);
		
		//출력방법2 - foreach문 이용
		for (int i : set) { //오토 언박싱
			System.out.println(i);
		}
		
		//출력방법3 - Iterator 이용
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			System.out.println("%%" + num);
		}
		
		

	}

}
