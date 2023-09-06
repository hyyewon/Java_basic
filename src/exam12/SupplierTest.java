package exam12;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		//익명클래스
		Supplier<String> s = new Supplier<String>() {
			
			@Override
			public String get() {
				return "Anonymous";
			}
		};
		String result = s.get();
		System.out.println("result:"+result);
		
		//람다표현식
		Supplier<String> s2 = () -> "Lambda";
		String result2 = s2.get();
		System.out.println("result2:"+result2);
		
		//////////////////////////////////////////
		//리턴 타입이 정해져있는 경우
		//BooleanSupplier
		//익명클래스
		int num = 10;
		BooleanSupplier x = new BooleanSupplier() {
			
			@Override
			public boolean getAsBoolean() {
				return num%2==0;
			}
		};
		Boolean b = x.getAsBoolean();
		System.out.println("num값이 짝수냐? "+b);
		
		//람다표현식
		BooleanSupplier x2 = () -> num%2!=0;
		Boolean b2 = x2.getAsBoolean();
		System.out.println("num값이 홀수냐? "+b2);
		
		////////////////////////////////////////
		//IntSupplier
		//익명클래스
		String name = "홍길동";
		IntSupplier y = new IntSupplier() {
			
			@Override
			public int getAsInt() {
				return name.length();
			}
		};
		int y2 = y.getAsInt();
		System.out.println("name 문자열 길이 "+y2);
		
		//람다표현식
		IntSupplier y3 = () -> name.length();
		int y4 = y3.getAsInt();
		System.out.println("람다표현식 name 문자열 길이 "+y4);
		
	}//end main

}//end class
