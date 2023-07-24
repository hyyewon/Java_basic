package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		//Set 계열 : 순서 없고, 중복 불가한 자료구조
		HashSet set = new HashSet(); //저장소 (바구니) 생성
		
		set.add("홍길동");
		set.add(20); //자동으로 auto boxing -> new Integer로 들어감
		set.add(3.14); //자동으로 auto boxing
		set.add('A'); //자동으로 auto boxing
		set.add(true); //자동으로 auto boxing
		
		//중복가능 여부 확인
		set.add("홍길동");
		set.add(20); 
		set.add(3.14); 
		set.add('A'); 
		set.add(true);
		
		//출력방법1 - toString()이용
		//참조변수 출력하면 자동으로 toString 적용
		System.out.println(set); //[A, 홍길동, 20, 3.14, true]
		
		//출력방법2 - foreach문
		for (Object obj : set) { //다형성, 어떤 데이터인지 모르기때문에 모든 데이터를 전부 저장하기 위해 Object로 받음
			System.out.println(">>"+obj);
		}
		
		//출력방법3 - Collection 메서드 Iterator 활용
		//컬렉션에 저장된 데이터를 반복적으로 가져오는 방법
		Iterator ite = set.iterator();
		while (ite.hasNext()) { //데이터가 있으면(true면)
			System.out.println("###"+ite.next());
		}

	}

}
