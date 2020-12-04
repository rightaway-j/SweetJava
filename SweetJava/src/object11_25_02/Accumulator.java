package object11_25_02;
//정적 필드가 있는 클래스
class Accumulator {

	int total = 0;
	static int grandTotal = 0; 
	
	void accumulate(int amount) {
		total += amount;
	
		
		grandTotal += amount;
	
		
	}
	/*정적 메서드 안에서는 인스턴스 변수, 인스턴스 메서드사용 가능.
	 * 인스턴스 변수와 인스턴스 메서드는 객체 생성시 사용할 수 있는 멤버들이기 때문에
	 * 인스턴스 생성과 관련없는 static 메서드 안에서는 사용할 수 없습니다.
	 * 따라서 this도 사용할 수 없다
	 */
	static int getGrandTotal() {//정적 메서드 선언//static
		//total = 5; //에러발생//static은 먼저 올라가있음-객체생성하지 않아도 (만들어지는 시간이 다름)//new 가 언제 오는지 몰라서 사용하지 못함
		//accumulate(100); //에러발생 (static 안에서 사용 못한다)
		return grandTotal;
	}
}
