package object_toString12_01_02;

public class GoodsStock {// Ŭ������ ������ �����ϴ� Ű����
	String goodsCode;// ��ǰ �ڵ�
	int stockNum;// ��� ����

	GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}

	public String toString() {
		String str = "��ǰ�ڵ�:" + goodsCode + " ������:" + stockNum;
		return str;
	}

}
