package test;

public class Dog {
	String name = "뽀미";
	private static Dog instance;
	
	//생성자를 막는다
	private Dog() {
		
	}
	//막아버렸으니 인스턴스를 제공할 의무가 생긴다.
	public static Dog getInstance() {
		if(instance==null) {
			instance = new Dog();
		}
		return instance;
	}
}
