package exam13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI_1_스트림생성 {

	public static void main(String[] args) {
		//1.컬렉션에서 stream 생성
		List<String> list = Arrays.asList("Kelly","Ben","Liv");
		Stream<String> s = list.stream(); //컬렉션 -> stream
		System.out.println("스트림 요소 개수:"+s.count()); //stream 끝 - 소모됨
		
		//익명클래스
		Consumer<String> c = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		list.stream().forEach(c); //따라서 새로운 stream을 반복적으로 만들어줘야 안에 있는 메서드 사용 가능
		System.out.println();
		
		//람다표현식
		list.stream().forEach(t->System.out.println(t));
		System.out.println();
		
		//method reference
		list.stream().forEach(System.out::println);
		
		System.out.println("#############################");
		//2.배열에서 stream 생성
		String [] names = {"Kelly1","Ben1","Liv1"};
		Stream<String> x = Stream.of(names); //배열 -> stream
		x.forEach(System.out::println);
		System.out.println();
		
		Stream<String> x2 = Arrays.stream(names); //배열 -> stream
		x2.forEach(System.out::println);
		System.out.println();
		
		//3.리터럴(값)에서 stream 생성
		Stream<String> y = Stream.of("Kelly2","Ben2","Liv2");
		y.forEach(System.out::println);
		System.out.println();
		
		Stream<Integer> y2 = Stream.of(10,20,30);
		y2.forEach(System.out::println);

	
	
	}

}
