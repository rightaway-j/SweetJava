package GoodsStockTest11_24;

public class GoodsStock_test {
public static void main(String args[]) {//객체 생성없이 가능한이유static이 있기 때문에
	GoodsStock obj; // 변수 선언
	obj = new GoodsStock("52135",200); //매개변수가 있느냐 없느냐에 따라 다름//객체 생성GoodsStock(String code, int num)의 자료형맞게 값을 넣어생성함
//	GoodsStock(String code, int num)
	
	print(obj);//메서드를 따로 빼주고 print(obj);로 호출하여 print
	
	obj.addStock(1000);//메서드 호출
	System.out.println("=====obj.addStock(1000)후=====");
	print(obj);
	
	obj.subtractStock(500);//메서드 호출
	System.out.println("=====obj.subtractStock(1000)후=====");
	print(obj);
}
//메서드 만들기
private static void print(GoodsStock obj) {//매개변수 GoodsStock의 obj 변수를 출력할거야
	System.out.println("상품코드:" + obj.goodsCode);//필드값 사용
	System.out.println("재고수량:" + obj.stockNum);
	
}//메서드를 따로 빼줌
}
