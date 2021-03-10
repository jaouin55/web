package person;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person person = new Person();
			person.age=28;
			person.name="오성규";
			person.isMarried=false;
			person.numberOfChildren=0;
		
			
			System.out.println("나이:"+person.age);
			System.out.println("이름:"+person.name);
			System.out.println("결혼여부:"+person.isMarried);
			System.out.println("자녀수:"+person.numberOfChildren);
	}
}
