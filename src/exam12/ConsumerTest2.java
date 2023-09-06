package exam12;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest2 {

	public static void main(String[] args) {
		
		//파라미터 2개인 경우
		
		//익명클래스
		BiConsumer<String, Integer> x = new BiConsumer<String, Integer>() {
			
			@Override
			public void accept(String t, Integer u) {
				System.out.println("BiConsumer:"+t+"\t"+u);
			}
		};
		x.accept("Anonymous", 10);
		
		//람다표현식
		BiConsumer<String, Integer> x2 = (t, u) -> System.out.println("람다표현식 BiConsumer:"+t+"\t"+u);
		x2.accept("Lambda", 100);
		
		//////////////////////////////////
		//ObjIntConsumer
		//익명클래스
		ObjIntConsumer<String> y = new ObjIntConsumer<String>() {
			
			@Override
			public void accept(String t, int value) {
				System.out.println("ObjIntConsumer:"+t+"\t"+value);
			}
		};
		y.accept("Anonymous2", 20);
		
		//람다표현식
		ObjIntConsumer<String> y2 = (t,value) -> System.out.println("람다표현식 ObjIntConsumer:"+t+"\t"+value);
		y2.accept("Lambda2", 200);
		
	}//end main

}//end class
