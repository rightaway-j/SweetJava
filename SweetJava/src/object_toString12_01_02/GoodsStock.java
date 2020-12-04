package object_toString12_01_02;

public class GoodsStock {// 클래스의 선언을 시작하는 키워드
	String goodsCode;// 상품 코드
	int stockNum;// 재고 수량

	GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}

	public String toString() {
		String str = "상품코드:" + goodsCode + " 재고수량:" + stockNum;
		return str;
	}

}
