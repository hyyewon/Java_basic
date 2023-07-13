package exam02;

public class OperatorTest6 {
	
	
	public static void main(String[] args) {
	
		//6. 3항 연산자 ( 중첩 가능 )
		
				int num = (3>2)?100:200;
				System.out.println(num);
			
				int num2 = (3>4)?100:(3>2)?200:300;
				System.out.println(num2);
				
				String s = (3>2)?"A":"B";
				System.out.println(s);
				
		}
		
}
