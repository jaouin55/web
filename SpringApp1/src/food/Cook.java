package food;

public class Cook {
	FriPan pan;
	
	public Cook() {
		pan = new FriPan();
	}
	
	public void makeFood() {
		pan.boil();
	}
}
