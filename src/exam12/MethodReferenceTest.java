package exam12;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Calculator{
	
	public Calculator () {
		System.out.println("Calculator 기본생성자");
	}
	
	public Calculator (int x) {
		System.out.println("Calculator 생성자 (int x)");
	}
	
	public Calculator (int x, String x2) {
		System.out.println("Calculator 생성자 (int x, String x2)");
	}
	
}

public class MethodReferenceTest {

	public static void main(String[] args) {
	
		//1.생성자 method Reference
		
		//가.파라미터 X, 리턴타입 O (기본생성자)
		//기본생성자는 파라미터가 없기 때문에 Supplier를 생성해서 원하는 클래스 생성 가능
		
		//익명클래스
		Supplier<Calculator> s = new Supplier<Calculator>() {
			
			@Override
			public Calculator get() {
				return new Calculator();
			}
		};
		
		
		//람다표현식
		Supplier<Calculator> s2 = () -> new Calculator();
		
		//method reference
		Supplier<Calculator> s3 = Calculator::new; //객체를 생성하는 람다표현식의 함축형
		Calculator c = s3.get();
		System.out.println(c);
		
		//나.파라미터 O, 리턴타입 O + 파라미터가 하나인 경우 (public Calculator 생성자 (int x))
		//익명클래스
		Function<Integer, Calculator> f = new Function<Integer, Calculator>() {
			
			@Override
			public Calculator apply(Integer t) {
				return new Calculator(t);
			}
		};
		//람다표현식
		Function<Integer, Calculator> f2 = t -> new Calculator(t);
		
		//method reference
		Function<Integer, Calculator> f3 = Calculator::new;
		Calculator c2 = f3.apply(100);
		System.out.println(c2);
		
		//나.파라미터 O, 리턴타입 O + 파라미터가 두개인 경우 (public Calculator 생성자 (int x, String x2))
		//익명클래스
		BiFunction<Integer, String, Calculator> x = new BiFunction<Integer, String, Calculator>() {
			
			@Override
			public Calculator apply(Integer t, String u) {
				return new Calculator(t,u);
			}
		};
		//람다표현식
		BiFunction<Integer, String, Calculator> x2 = (t,u) -> new Calculator(t,u);
		
		//method reference
		BiFunction<Integer, String, Calculator> x3 = Calculator::new;
		Calculator c3 = x3.apply(10, "MR");
		System.out.println(c3);
		
		
		
		
	}//end main

}//end class
