package exam02;

import java.util.Scanner;

public class ForTest {
	
	
	public static void main(String[] args) {
	
		//for 문
		
				//1. 기본
				for(int n=1; n<6; n++) {
					System.out.println("hi");
				}
						
				//2. 특화된 코드
				for(int n=5; n>0; n--) {
					System.out.println("hey");
				}
				
				for(int n=1; n<10 ; n+=2) {
					System.out.println("you");
				}
				
				for(int n=1,n2=1; n<10 && n2<3; n+=2, n2++) {
					System.out.println("yes");
				}
				
				//중첩
				for(int n=1; n<6; n++) {
					for(int n2=1; n2<3; n2++) {
						System.out.println("YES!");
					}
				}
			    
				
		}
		
}
