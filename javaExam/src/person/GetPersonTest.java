package person;

public class GetPersonTest {

	public static void main(String[] args) {
		
		Getperson getperson= new Getperson();
			
			getperson.setAge(40);
			getperson.setName("James");
			getperson.setMarried(true);
			getperson.setNumberOfChildren(3);
			
			System.out.println("나이:"+getperson.getAge());
			System.out.println(getperson.getName());
			System.out.println(getperson.getNumberOfChildren());
			System.out.println(getperson.isMarried());
			
	}
}
