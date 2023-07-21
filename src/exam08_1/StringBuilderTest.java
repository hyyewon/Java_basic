package exam08_1;

import java.util.Arrays;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		//StringBuilder 클래스 이용한 문자열 생성 => 버퍼로 동작되기 때문에 자신의 문자열이 변경된다.
		StringBuilder sb = new StringBuilder("HeLLO"); //권장 
		StringBuffer sb2 = new StringBuffer("HeLLO"); 
				
		//메서드
		System.out.println("1.문자열 추가:" + sb.append("hello"));
		System.out.println("1.문자열 추가:" + sb.append(2));
		System.out.println("1.문자열 추가:" + sb.append(3.14));
		
		System.out.println("2.삽입:" + sb.insert(0, "홍길동"));
		System.out.println("2.삽입:" + sb.insert(0, 100));
		
		System.out.println("2.삭제:" + sb.delete(0, 6)); //0~5까지 삭제
		
		//charAt, substring, indexof 지원됨
		
		System.out.println("4.거꾸로:" + sb.reverse()); 
		
		System.out.println(sb); //원본 자체가 변경
		
		//가장 마지막 작업을 String으로 저장해서 사용된다. (형변환 불가능)
		String s =sb.toString();
		System.out.println("최종결과:" + s);
	}

}
