package person;

public class TryCatch {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				arr[i]=i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

