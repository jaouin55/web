//일반프라이팬이건,전기프라이팬이건 모두를 가르킬 수 있는 최상위 인터페이스
//(추상클래스도 가능하지만 , 다중상속이 될 우려가 있으므로 인터페이스가 압도적으로 많이 사용)

package food;

public interface Pan {
	
	//구현 강제할 메서드
	public void boil();
}
