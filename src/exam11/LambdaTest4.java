package exam11;

//인터페이스
@FunctionalInterface //추상메서드를 하나만 갖게끔 강제하는 어노테이션
 	interface Flyer4{
		//라. 파라미터 O, 리턴값 O
 		public int fly(int n, int n2);
// 		public default void a() {}
// 		public default void a2() {}
 	}

public class LambdaTest4 {

	public static void main(String[] args) {
		
		//익명클래스
		Flyer4 f = new Flyer4() {
			
			@Override
			public int fly(int n, int n2) {
				System.out.println("fly(int n, int n2)"+n+"\t"+n2);
				return n+n2;
			}
		};

		int result = f.fly(10, 20);
		System.out.println("result:"+result);
		
		//람다표현식
		Flyer4 f2 = (int n, int n2) -> {
			return n+n2;
		};
		
		Flyer4 f3 = (n, n2) -> {
			return n+n2;
		};
		
		//리턴 문장만 있으면, {}와 return 키워드 생략 가능
		Flyer4 f4 = (n, n2) -> n+n2;
		int result4 = f4.fly(100, 200);
		System.out.println("result4:"+result4);
		
		
	}//end main

}//end class
