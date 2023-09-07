package exam13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI_2_중간처리1_distinct_filter {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Kelly","Ben","Liv","Kelly","Kai","King");
		
		//1.중간처리 (중복제거-distinct)
		list.stream().distinct().forEach(System.out::println);
		System.out.println("######################");
		
		//2.중간처리 (필터링-filter)
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.startsWith("K");
			}
		};
		
		list.stream().filter(p).forEach(System.out::println);
		System.out.println();
		
		//람다표현식
		list.stream().filter(t->t.startsWith("K")).forEach(System.out::println);
		System.out.println();
		
		//3.혼합 (distinct + filter)
		list.stream().distinct().filter(t->t.startsWith("K")).forEach(System.out::println);
		
	
	
	}//end main

}//end class
