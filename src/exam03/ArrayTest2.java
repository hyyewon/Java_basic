package exam03;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		//1. 1차원 배열 - new 이용
		
		//가. 배열 선언
		String [] n2; //n2: 변수, 참조형 변수, 로컬변수, String 타입의 배열 변수
		
		//나. 배열 생성
		n2 = new String[3];
		System.out.println(n2[0]); //참조형 변수는 null 값으로 자동초기화
		
		//다. 값 부여
		n2[0] = "John";
		System.out.println(Arrays.toString(n2));
		
	}
}
