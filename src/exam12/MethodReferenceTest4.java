package exam12;

import java.util.function.Consumer;


public class MethodReferenceTest4 {

	public static void main(String[] args) {
	
		//4. System.out.println 메서드 method Reference
		
		//파라미터O, 리턴X
		//익명클래스
		Consumer<String> c = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		//람다표현식
		Consumer<String> c2 = t -> System.out.println(t);
		
		//method reference
		Consumer<String> c3 = System.out::println; //매우 중요***
		c3.accept("method reference");
		
		
	}//end main

}//end class
