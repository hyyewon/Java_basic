package exam03;

import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		//1. 1차원 배열 - literal 이용
		
		//기본형 배열
		int [] n = {10,20};
		System.out.println(n.length);
		
		//값 변경
		n[0]=100;
		System.out.println(Arrays.toString(n));
		
		//참조형 배열
		String [] n2 = {"John", "Kalin", "ella"};
		System.out.println(n2.length);
		System.out.println(n2[0]);
	}
}
