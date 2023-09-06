package exam11;

//인터페이스
@FunctionalInterface //추상메서드를 하나만 갖게끔 강제하는 어노테이션
 	interface Flyer2{
		//나. 파라미터 O, 리턴값 X
 		public void fly(int n);
 	}

public class LambdaTest2 {

	public static void main(String[] args) {
		
		//익명클래스
		Flyer2 f = new Flyer2() {
			
			@Override
			public void fly(int n) {
				System.out.println("Flyer2 fly(int n)"+n);
				
			}
		};
		
		f.fly(10);
		
		//람다표현식
		Flyer2 f2 = (int n) -> {System.out.println("람다표현식 Flyer2 fly(int n)"+n);};
		f2.fly(20);
		
		//데이터 타입 생략 가능
		Flyer2 f3 = (n) -> {System.out.println("람다표현식 Flyer2 fly(int n)"+n);};
		f3.fly(30);
		
		//파라미터(매개변수)가 하나인 경우 괄호 생략 가능
		Flyer2 f4 = n -> {System.out.println("람다표현식 Flyer2 fly(int n)"+n);};
		f4.fly(40);

	}//end main

}//end class
