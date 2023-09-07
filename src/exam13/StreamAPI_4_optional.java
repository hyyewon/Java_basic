package exam13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class StreamAPI_4_optional {

	public static void main(String[] args) {
		
		/*
		 * OptionalInt, OptionalDouble, OptionalLong
		 * 역할 : 컬렉션에 값이 없을 경우 집계 메서드를 사용하면 
		 * 		예외가 발생.
		 * 		이러한 예외를 방지 + default 값 설정하는 기능 제공
		 * 
		 */
		
		//1.컬렉션에 값이 존재하는 경우
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(25);
		
		
		
		OptionalDouble avg = list.stream()
								 .mapToDouble(a->a) //Integer --> Double , asDoubleStream으로 사용해도 무관
								 .average();
		
		System.out.println(avg); //OptionalDouble[17.5]
		System.out.println(avg.getAsDouble()); //17.5
		System.out.println(avg.orElse(0.0)); //17.5
		
		//2.컬렉션에 값이 없는 경우
		List<Integer> list2 = new ArrayList<>();
		OptionalDouble avg2 = list2.stream()
				 .mapToDouble(a->a) //Integer --> Double , asDoubleStream으로 사용해도 무관
				 .average();

		System.out.println(avg2); //OptionalDouble.empty
//		System.out.println(avg2.getAsDouble()); //예외 발생
		System.out.println(avg2.orElse(0.0)); //예외 발생 대신에 기본값으로 처리
		
	}//end main

}//end class
