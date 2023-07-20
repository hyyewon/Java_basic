package exam07_2;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
	}

	//오버라이딩
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
		
	}

	public Cat() {}

	public Cat(String name, int age) {
		super(name, age);   //명시적으로 부모생성자 호출, name와 age변수는 부모에 있기 때문에 부모한테 넘겨줌
	}

	@Override
	public String toString() {
		return String.format("Cat 이름:%s , Cat 나이:%d \n", name, age);
	}
	
	
	
}
