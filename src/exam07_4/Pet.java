package exam07_4;

public abstract class Pet {

	String name;
	int age;
	
	//추상메서드가 없어도 추상클래스는 만들 수 있음.
	//자식클래스에서 꼭 사용하고자 하는 메서드를 추상메서드로 만든다.
	public abstract void eat() ;
	public abstract void sleep() ;
	

	
	public Pet() {}
	
	

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
