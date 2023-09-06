package exam11;

//인터페이스
@FunctionalInterface //추상메서드를 하나만 갖게끔 강제하는 어노테이션
 	interface Flyer{
		//가. 파라미터 X, 리턴값 X
 		public void fly();
// 		public void fly2();
 	}

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//익명 클래스
		/*
		 * 인터페이스명 변수명 = new 인터페이스명(){
		 *   //추상메서드 재정의
		 *   };
		 *
		 */
		
		Flyer f = new Flyer() {

			@Override
			public void fly() {
				System.out.println("Flyer fly()");
			}
			
		};
		
		f.fly();
		
		//람다표현식 (메서드에 충실하게 표현하는 방법)
		Flyer f2 = () -> {System.out.println("람다표현식 Flyer fly()");};
		f2.fly();
		

	}

}
