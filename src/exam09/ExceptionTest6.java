package exam09;

class Test5{
	public void b() throws ArithmeticException,NullPointerException { //a한테 예외처리 맡김
		System.out.println("Test.a");
		//연산작업
			//ArithmeticException 발생 가능한 코드
			int num = 0;
			int result = 10/num; //예외 발생 ==> 비정상종료됨. ==> 정상종료됨.
			System.out.println("결과값:"+result);
			
			//NullPointerException 발생 가능한 코드
			String n = null;
			System.out.println(n.length());
		
		
	}
	
	public void a() throws ArithmeticException, NullPointerException {
		b();
	}
	
}

public class ExceptionTest6 {

	public static void main(String[] args) {
		//정상종료 :main에서 시작하여 끝까지 실행되고 종료되는 것.
		System.out.println("1");
		System.out.println("2");
		
		Test5 t = new Test5();
		try {
			t.a();
		}catch(ArithmeticException e) {
			System.out.println("error: 0으로 나누어 발생");
		}catch(NullPointerException e) {
			System.out.println("error: 객체 생성 필요");
		}catch(Exception e) {
			System.out.println("error 발생");
		}
		
		System.out.println("end. 정상종료");
		
		
	}

}
