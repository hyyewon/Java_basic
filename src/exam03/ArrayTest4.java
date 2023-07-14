package exam03;

import java.util.Arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		//1. 1차원 배열 - new + literal 이용
		
		//기본형
		int [] n = new int[] {10,20};
		
		System.out.println(n.length);
		System.out.println(n[0]);
		System.out.println(n[1]);
		
		//참조형
		String [] n2 = new String [] {"John", "Kavin", "Lala"};
		System.out.println(n2.length);
		
		
	}
}
