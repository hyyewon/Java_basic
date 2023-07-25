package exam10_2;

import java.util.ArrayList;
import java.util.List;

// <?>
public class GenericsTest3 {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
		list.add("Kai");
		list.add("John");
		
		printData(list);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		
		printData(list2);
	}
	
	public static void printData(List<?> xxx) { //<?> : 모든 타입 데이터
		System.out.println(xxx);
	}

}
