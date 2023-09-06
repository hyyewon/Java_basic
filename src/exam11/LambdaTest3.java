package exam11;

//인터페이스
@FunctionalInterface //추상메서드를 하나만 갖게끔 강제하는 어노테이션
 	interface Flyer3{
		//나. 파라미터 O, 리턴값 X
 		public void fly(int n, int n2);
 	}

public class LambdaTest3 {

	public static void main(String[] args) {
		
		//익명클래스
		Flyer3 f = new Flyer3() {
			
			@Override
			public void fly(int n, int n2) {
				System.out.println("Flyer3 fly(int n, int n2)"+n+"\t"+n2);
			}
		};
		
		f.fly(10, 20);
		
		//람타표현식
		Flyer3 f2 = (int n, int n2) -> {
			System.out.println("Flyer3 fly(int n, int n2)"+n+"\t"+n2);
		};
		
		Flyer3 f3 = (n, n2) -> {
			System.out.println("Flyer3 fly(int n, int n2)"+n+"\t"+n2);
		};
		
		f3.fly(100, 200);
		
	}//end main

}//end class
