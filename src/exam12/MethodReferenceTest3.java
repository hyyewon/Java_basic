package exam12;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class Calculator3{
	//인스턴스 메서드
	public static int methodA(int x, int y) {
		return x+y;
	}
	
}

public class MethodReferenceTest3 {

	public static void main(String[] args) {
	
		//3.static 메서드 method Reference
		//가.파라미터 O, 리턴타입 O
		//익명클래스
		BinaryOperator<Integer> x = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return Calculator3.methodA(t, u);
			}
		};
		//람다표현식
		BinaryOperator<Integer> x2 = (t,u) -> Calculator3.methodA(t, u);
		
		//method reference
		BinaryOperator<Integer> x3 = Calculator3::methodA;
		int result = x3.apply(10, 20);
		System.out.println("결과:"+result);
		
		////////////////////////////////////////////////////////
		//API 중에서 대표적인 static 메서드 : Integer.parseInt("10"), String.valueOf(10)
		
		//int xxx = Integer.parseInt("10");
		//익명클래스
		Function<String, Integer> y = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		//람다표현식
		Function<String, Integer> y2 = t -> Integer.parseInt(t); //중요**
		
		//method reference
		Function<String, Integer> y3 = Integer::parseInt;
		int result2 = y3.apply("10");
		System.out.println("결과:"+(result2+10));
		
		
	}//end main

}//end class
