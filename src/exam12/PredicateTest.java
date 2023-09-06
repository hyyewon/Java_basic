package exam12;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		//파라미터 하나인 경우
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.length()==5;
			}
		};
		boolean result = p.test("hello");
		System.out.println("결과:"+result);
		
		//람다표현식
		Predicate<String> p2 = t -> t.length()==5;
		boolean result2 = p2.test("hellooo");
		System.out.println("결과:"+result2);
		
		////////////////////////////////////////
		//파라미터 타입이 정해져 있는 경우
		IntPredicate pp = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value>10;
			}
		};
		boolean result3 = pp.test(5);
		System.out.println("결과:"+result3);
		
		//람다표현식
		IntPredicate pp2 = value -> value>10;
		boolean result4 = pp2.test(11);
		System.out.println("결과:"+result4);
		
		//파라미터 두개인 경우
		BiPredicate<String, Integer> a = new BiPredicate<String, Integer>() {
			
			@Override
			public boolean test(String t, Integer u) {
				return t.length()==u;
			}
		};
		boolean result5 = a.test("hello",5);
		System.out.println("결과:"+result5);

		//람다표현식
		BiPredicate<String, Integer> a2 = (t,u) -> t.length()==u;
		boolean result6 = a2.test("hello",5);
		System.out.println("결과:"+result6);
		
		
		
		
	}

}
