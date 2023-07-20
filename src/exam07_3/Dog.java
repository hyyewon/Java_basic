package exam07_3;

//클래스 파일 만들 때 extends하는 법
public class Dog extends Pet {

	String sex;

	//오버라이딩은 강제성이 없다.
	public void eatDog() {
		System.out.println("Dog.eat");
	}

	public void sleepDog() {
		System.out.println("Dog.sleep");
	}

	public Dog() {}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return String.format("Dog 이름:%s , Dog 나이:%d , Dog 성별:%s \n", name, age, sex);
	}

	
	
	
	
}
