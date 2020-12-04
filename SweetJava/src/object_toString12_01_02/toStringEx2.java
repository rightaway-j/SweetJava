package object_toString12_01_02;

public class toStringEx2 {
	public static void main(String args[]) {
		GoodsStock obj = new GoodsStock("73623",200);
		String str = "재고정보=" + obj;
		/*
		 *문자열과 goodstock 객체 변수를 +연산자로 연결하면 그 객체의 toString 메서드가 자동으로 호출된 후 문자열이 연결됨.
		 *String str = "재고정보=" +obj.toString()
		 goodsstock 에 있는 메서드 가져와서 실행한 것
		 */
		System.out.println(str);
	}
}
