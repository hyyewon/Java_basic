package exam10_2;

import java.util.ArrayList;
import java.util.List;

//<? extends E>

class Person{}
class Man extends Person{}
class Woman extends Person{}


public class GenericsTest4 {

	public static void main(String[] args) {

		//Man만 저장
		List<Man> list = new ArrayList<>();
		list.add(new Man());
		list.add(new Man());
		printdata(list);
		printdata2(list);
		
		//Woman만 저장
		List<Woman> list2 = new ArrayList<>();
		list2.add(new Woman());
		list2.add(new Woman());
		printdata(list2);
//		printdata2(list2);
		
		//String만 저장
		List<String> list3 = new ArrayList<>();
		list3.add("Kai");
		list3.add("Sebastian");
//		printdata(list3);
//		printdata2(list3);
		
		//Person만 저장
		List<Person> list4 = new ArrayList<>();
		list4.add(new Person());
		list4.add(new Person());
		printdata(list4);
		printdata2(list4);
		
		
	}
	
	//person 및 자식만 저장하도록 강제
	public static void printdata(List <? extends Person> xxx) {
		
	}
	
	//Man 및 부모만 저장하도록 강제
	public static void printdata2(List <? super Man> xxx) {
		
	}
}
