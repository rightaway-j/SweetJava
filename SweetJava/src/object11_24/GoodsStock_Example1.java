package object11_24;

public class GoodsStock_Example1 {
public static void main(String args[]) {
	GoodsStock obj; // 변수 선언
	obj = new GoodsStock(); //객체 생성
	//GoodsStock obj = new GoodsSTock();
	
	obj.goodsCode = "52135";//필드에 값을 대입
	obj.stockNum = 200;//필드에 값을 대입
	System.out.println("상품코드:" + obj.goodsCode);//필드값 사용
	System.out.println("재고수량:" + obj.stockNum);
	
	obj.addStock(1000);//메서드 호출
	System.out.println("=====obj.addStock(1000)후=====");
	System.out.println("샃품코드:" +  obj.goodsCode);
	System.out.println("재고수량:" +  obj.stockNum);
	
	obj.subtractStock(500);//메서드 호출
	System.out.println("=====obj.subtractStock(1000)후=====");
	System.out.println("상품코드:" +  obj.goodsCode);
	System.out.println("재고수량:" +  obj.stockNum);
}
}
