package exam02;

import java.util.Scanner;

public class SwitchTest {
	
	
	public static void main(String[] args) {
	
		//3. switch			
				System.out.println("1");
		        int num = 10;
		        switch(num){
		            case 5: System.out.println("5"); break;
		            case 10: System.out.println("10"); break;
		            case 15: System.out.println("15"); break;
		            default: System.out.println("default");
		        }
		        char c = 'A';
		        switch(c){
		          case 'A':System.out.println("A"); break;
		          case 'B':System.out.println("B"); break;
		         default: System.out.println("default");
		        }

		        String c2 = "A";  // 한 글자인 경우도 "" 사용하면 문자열로 처리됨.
		        switch(c2){
		          case "A":System.out.println("A"); break;
		          case "B":System.out.println("B"); break;
		         default: System.out.println("default");
		        }
		        
				System.out.println("end");
		
		}
		
}
