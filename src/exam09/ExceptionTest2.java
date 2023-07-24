package exam09;

class Test{
	public void a() {
		System.out.println("Test.a");
		//연산작업
		int num = 0;
		int result = 10/num; //예외 발생 ==> 비정상종료됨.
		System.out.println("결과값:"+result);
	}
}

public class ExceptionTest2 {

	public static void main(String[] args) {
		//정상종료 :main에서 시작하여 끝까지 실행되고 종료되는 것.
		System.out.println("1");
		System.out.println("2");
		
		Test2 t = new Test2();
		t.a();
		
		System.out.println("end. 정상종료");
		
		
	}

}
