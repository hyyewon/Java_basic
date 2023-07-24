package exam10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest5 {

	public static void main(String[] args) {
		//Set 계열 : 순서 없고, 중복 불가한 자료구조
		
//		HashSet<String> set = new HashSet<String>(); //뒤의 꺽쇠에는 타입 생략 가능
		HashSet<String> set1 = new HashSet<>(); 
		Set<String> set = new HashSet<>(); //다형성 적용** Set은 HashSet보다 크기 때문에 HashSet저장 가능
		
		//가정 : 이름만 저장할 것이다.
		set.add("Kai");
		set.add("John");
		set.add("Kelly");
		
		//set 메서드 정리
		System.out.println("크기:"+set.size());
		System.out.println("값 존재여부:"+set.contains("Kai")); //값 존재여부:true
		System.out.println("값 존재여부:"+set.contains("Kenny")); //false
		System.out.println("비어있냐:"+set.isEmpty()); //false

		set.remove("John"); //John 삭제
		
		set.clear(); //전체 삭제
		System.out.println("비어있냐:"+set.isEmpty()); //true
		
		//출력방법 - toString(
		System.out.println(set);

	}

}
