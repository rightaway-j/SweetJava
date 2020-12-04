package object11_25_01;

public class LimitedValue {
// final 과static  위치 바뀌어도 됩니다.
	//final static int UPPPER_LIMIT = 100000;//상수 필드의 선언
	static final int UPPER_LIMIT = 100000;//상수 필드의 선언
	int value;
	
	void setValue(int value) {
		if (value< UPPER_LIMIT)
			this.value = value;
		else
			this.value = UPPER_LIMIT;//상수 필드의 사용
	}
}
