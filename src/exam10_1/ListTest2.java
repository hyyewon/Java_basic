package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		//List 계열 : 순서가 있고 중복이 가능
		//배열과 유사해서 인덱스 이용 가능
		ArrayList<String> list = new ArrayList<>(); //다형성
		
		list.add("Jack");
		list.add("Kelly");
		list.add("Sam");
		list.add("Jack");
		
		//메서드 정리
		System.out.println("크기:"+list.size());
		
		//수정
		list.set(1, "Joy");
		
		//삽입
		list.add(0, "Kai");
		
		//삭제
		list.remove(3); //위치로 삭제
		list.remove("Jack"); //값으로 삭제 , 일치하는 첫번째 값만 삭제됨. 모두 삭제하려면 removeAll사용
		
		//부분리스트
		List<String> subList = list.subList(0, 2);
		System.out.println(subList); 
		
		System.out.println(list); 
		
		
		
		
		

	}

}
