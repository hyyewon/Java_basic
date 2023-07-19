package exam06_5;

public class Dog extends Pet{

	
	String sex;
	
	
	public Dog() {}
	
	public Dog(String name, int age, String sex) {
		super(name,age);  // 부모가 초기화 할 수 있게끔 명시적으로 super코드 삽입
		this.sex = sex;
	}
	
	//재정의
		
	@Override
	public void eat() {
		System.out.println("Dog.eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog.sleep");}

	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
