package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		//List 계열 : 순서가 있고 중복이 가능
		//배열과 유사해서 인덱스 이용 가능
		ArrayList<String> list = new ArrayList<>(); //다형성
		
		list.add("Jack");
		list.add("Kelly");
		list.add("Sam");
		list.add("Jack");
		
		
		//Jack 삭제
		list.remove("Jack"); //첫번째 일치하는 값만 삭제
		//list.removeAll(Collection) - List나 Set으로 만들어줘야 사용가능한 메서드
		list.removeAll(Arrays.asList("Jack")); //List만드는 방법
		
		System.out.println(list);
		

	}

}
