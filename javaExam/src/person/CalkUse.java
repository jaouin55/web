package person;

public class CalkUse extends CalkAdapter{

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1-num2);
	}

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		CalkUse a = new CalkUse();
		int result = a.sub(3,2);
		int result2 = a.sum(3,4);
		System.out.println(result);
		System.out.println(result2);
	}
}
