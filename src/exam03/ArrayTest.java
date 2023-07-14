package exam03;

public class ArrayTest {

	public static void main(String[] args) {
		
		//1. 1차원 배열 - new 이용
		
		//가. 배열 선언
		int [] n;
		
		//나. 배열 생성
		n = new int [2];
		System.out.println(n[0]); //0
		
		//다. 값 부여
		n[0] = 10;
		System.out.println(n[0]);
	}
}
