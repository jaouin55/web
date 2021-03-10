package person;

public class GenericTest<Do> {

	private Do Sing;

	public Do getSing() {
		return Sing;
	}

	public void setSing(Do sing) {
		Sing = sing;
	}
	
	public String toString() {
		return Sing.toString();
	};
	
	public static void main(String[] args) {
		GenericTest<Iu> iu = new GenericTest<Iu>();
		Iu iu1 = new Iu();
		iu.setSing(iu1);
		System.out.println(iu);
	}
}
