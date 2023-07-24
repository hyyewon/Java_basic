package exam09;

import java.util.Random;

class MyRandom{
	
	public void rand() throws RuntimeException{ //2.예외처리
		
		Random r = new Random();
		int n = r.nextInt(3); //0~2 랜덤 정수 반환
		//가정 : 0이 나오면 시스템에 불량이 생길 수 있음
		//실제 적용 : DB에서 원하는 값을 못찾을 때.
		//1.명시적으로 예외 발생
		if(n==0)throw new RuntimeException("랜덤값에 0출력. 예외발생"); //강제적으로 예외를 발생시켜 비정상종료되도록 함.
		System.out.println(n);
	}
}

public class ExceptionTest8 {

	public static void main(String[] args) {
	
		MyRandom x = new MyRandom();
		try { //2.예외처리
		x.rand();
		}catch(RuntimeException e) {
			System.out.println("error 발생:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("error 발생");
		}
		System.out.println("End");
		
	}

}
