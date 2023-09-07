package exam13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class StreamAPI_3_최종처리_1_allMatch_anyMatch_noneMatch {

	public static void main(String[] args) {
		
		/*
		 * 최종처리 단계에서 요소들이 특정 조건에 부합하는지 확인
		 * 
		 * 가.allMatch(Predicate) : 모든 요소들이 Predicate 조건에 일치하는지 체크
		 * 나.anyMatch(Predicate) : 일부분 요소들이 Predicate 조건에 일치하는지 체크
		 * 다.noneMatch(Predicate) : 모든 요소들이 Predicate 조건에 일치하는지 않는지 체크
		 * 
		 * ==> 최종 결과는 boolean 값으로 반환
		 * 
		 */
		
		int [] arr = {1,2,3,4,5};
		
		//가.allMatch
		//익명클래스
		IntPredicate predicate = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value<10;
			}
		};
		//모든 요소가 10보다 작냐?
		boolean result = Arrays.stream(arr)
							   .allMatch(predicate);
		System.out.println("모든 요소가 10보다 작냐?"+result); //true

		//람다표현식
		result = Arrays.stream(arr).allMatch(t -> t<10);
		System.out.println("모든 요소가 10보다 작냐?"+result); //true
	
		//나.anyMatch
		//요소 중에서 3의 배수가 있냐?
		boolean result2 = Arrays.stream(arr).anyMatch(t->t%3==0);
		System.out.println("요소 중에서 3의 배수가 있냐?"+result2); //true
		
		//다.noneMatch
		//모든 요소 중에서 3의 배수가 없냐?
		boolean result3 = Arrays.stream(arr).noneMatch(t->t%3==0);
		System.out.println("요소 중에서 3의 배수가 없냐?"+result3); //false
		
	}//end main

}//end class
