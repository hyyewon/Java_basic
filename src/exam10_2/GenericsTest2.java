package exam10_2;

import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;

//제네릭스 등장배경
class Box2<T>{ //<T>: type이 뭐가 들어갈지 모를때
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	
	public T getValue() {
		return obj;
	}
}


public class GenericsTest2 {

	public static void main(String[] args) {

		//문자열만 저장
		Box2<String> b1 = new Box2<String>();
		Box2<String> b2 = new Box2<>();
		b1.setValue("Kai");
//		b1.setValue(10); //장점1: 컴파일시 잘못된 데이터를 저장했음을 안다.
		
		String str = b1.getValue(); //이슈2: 형변환 불필요.
		System.out.println("문자열 길이:"+str.length());
		
		//날짜만 저장
		Box2 <Date> b3 = new Box2<>();
		b3.setValue(new Date());
//		b3.setValue(10); //장점1: 컴파일시 잘못된 데이터를 저장했음을 안다.
		Date d = b3.getValue(); //이슈2: 형변환 불필요.
		System.out.println("날짜:"+d.getYear());
	}

}
