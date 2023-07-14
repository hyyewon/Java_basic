package exam03;

import java.util.Arrays;

public class ArrayTest7 {

	public static void main(String[] args) {
		
		//1. 2차원 배열 출력-비정방형
		
		int [][] n = new int[2][]; //행크기만 지정
		
		n[0] = new int[1];
		n[1] = new int[3];
		
		System.out.println(n[0][0]);
		System.out.println(n[1][2]);
		
		System.out.println("행길이:"+n.length);
		System.out.println("2행의 열길이:"+n[1].length);

		//초기화
		n[0][0]=1;
		n[1][0]=2;
		n[1][1]=3;
		n[1][2]=4;
		
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.println(n[i][j]);
			}
		}
		
		for(int []k:n) {
			for(int x:k) {
				System.out.println(x);
			}
		}
	}
}
