package exam07_1;

public class TesPet {

	public static void main(String[] args) {

		Cat c = new Cat("야옹이",2);

		System.out.println(c); //Object의 toString()  :  참조변수를 콘솔에 출력할 때 자동 호출된다. // 재정의 후 결과 : Cat [name=야옹이, age=2]
		System.out.println(c.toString()); //exam07_1.Cat@15db9742 (주소값 출력) - 패키지명.클래스명@16진수
	}

}
