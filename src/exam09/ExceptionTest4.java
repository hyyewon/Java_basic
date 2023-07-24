package exam09;

class Test3{
	public void a() {
		System.out.println("Test.a");
		//연산작업
		//발생된 부분에서 예외처리
		try {
			
			//ArithmeticException 발생 가능한 코드
			int num = 2;
			int result = 10/num; //예외 발생 ==> 비정상종료됨. ==> 정상종료됨.
			System.out.println("결과값:"+result);
			
			//NullPointerException 발생 가능한 코드
			String n = null;
			System.out.println(n.length());
		
		
		}catch(ArithmeticException e) { //적합한 예외클래스 선언 또는 다형성 적용 가능
			System.out.println("error: 0으로 나누어 발생");
		}catch(NullPointerException e) {
			System.out.println("error: 객체 생성 필요");
		}catch (Exception e) { //관례적으로 가장 마지막에 사용하여 혹시라도 있을지 모르는 예외를 처리.
			System.out.println("error 발생");
		}finally {
			System.out.println("예외 발생과 상관없이 무조건 실행되는 문장, 일반적으로 외부파일/DB의 close작업 수행");
		}
		
	}
}

public class ExceptionTest4 {

	public static void main(String[] args) {
		//정상종료 :main에서 시작하여 끝까지 실행되고 종료되는 것.
		System.out.println("1");
		System.out.println("2");
		
		Test3 t = new Test3();
		t.a();
		
		System.out.println("end. 정상종료");
		
		
	}

}
