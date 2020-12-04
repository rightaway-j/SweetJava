package GoodsStockTest11_24;
/*클래스 이름: GoodStock
 * 1.필드
 * goodsCode(상품코드: String)
 * stockNum(재고 수량 : int)
 * 
 * 2.매개 변수갖는 생성자
 * 첫번째 배개 변수: String
 * 두번째 매개변수:int
 * 3.메서드
 * 하나) 이름: addStock
 * 매개변수 : 정수형 한개
 * 기능:
 * 매개 변수로 받은 값을 기존의 재고 수량값에 더한다.
 * 반환형: void
 * S
 * 둘) subtractStock
 * 매개변수 : 정수형 한개
 * 기능1) 매개 변수로 받은 값이 재고 수량 값보다 크다면 0을 리턴하고 메서드 종료 한다.
 * 	2)매개 변수로 받은 값이 재고 수량값보다 크지 않으면 메게 변수로 받은 값을 기존의 재고 수량값에서 빼고 배개 변수 값을 리턴하빈다.
 * 반환형: 매개변수 의 값(int)
 */
public class GoodsStock {//클래스의 선언을 시작하는 키워드
	String goodsCode;//상품 코드
	int stockNum;//재고 수량
	/*
	//생성자-인스턴스가 생성될 때 호출되는 ' 인스턴스 초기화 메서드'이다
	따라서 인스턴스 변수의 초기화 작업에 주로 사용되며 인스턴스 생성시에 실행되어야 할 작업을 위해서도 사용됨.
	생성자도 오버로딩이 가능, 여러개의 생성자가 존재 할수 있음
	조건=메서드이지만 리턴 값이없다./ 생성자의 이름은 클래스의 이름과 같아야함
	public GoodStock() {//2번 ,생성자 작성(클래스명과 같음), 메서드 안에 메서드 안됨
	====================================================================
	매개변수가 없는 생성자 - 기본 생성자
	클래스에는 반드시 하나 이상의 생성자가 정의 되어 있어야 함/
	생자가 없는 경우 자동으로 추가됨(기본생성자라 불름)
	매개변수가 있는 생성자가 한개라도 작성된 경우에는 기본 생성자는 자동추가되지 않습니다.
	*/

 GoodsStock(String code, int num){ //GoodsStock(){}이렇게 되어 있으면 주석처리해도(없어도)도 만들어준다(단, 생성자가 (매개변수)하나도 없을 경우)
	 goodsCode = code;
	 stockNum = num;
}
 void addStock(int amount) {//재고를 더한다 기능에 해당하는 메소드
	 stockNum += amount;
 }//반환형 void
 int subtractStock(int amount) {//재고를 뺀다 기능에 해당하는 메소드
	 if (stockNum <amount)
		 return 0;
	 stockNum -= amount;
	 return amount; //반환형 int
 }
		 
	 
 }

 
