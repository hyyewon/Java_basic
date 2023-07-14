package exam03;

import java.util.Arrays;

public class ArrayTest5 {

	public static void main(String[] args) {
		
		//1. 1차원 배열 출력
		
		int [] n = new int [] {10,20,30,40};
		
		//1) 개별적으로 idx이용
		System.out.println(n[0]);
		
		//2)일반 for문
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
		
		//3)foreach문
		/*
		 * for(변수:배열명){ JS의 for~of와 동일
		 * 
		 * }
		 */
		for(int k:n) {
			System.out.println(k);
		}
		
		//4)배열 ==> 한번에 문자열로 출력(java.util.Arrays 클래스 이용)
		// 자동 import : Arrays.toString(배열명);
		System.out.println(Arrays.toString(n));
		
	}
}
