package GoodsStockTest11_24;

public class GoodsStock_test {
public static void main(String args[]) {//��ü �������� ����������static�� �ֱ� ������
	GoodsStock obj; // ���� ����
	obj = new GoodsStock("52135",200); //�Ű������� �ִ��� �����Ŀ� ���� �ٸ�//��ü ����GoodsStock(String code, int num)�� �ڷ����°� ���� �־������
//	GoodsStock(String code, int num)
	
	print(obj);//�޼��带 ���� ���ְ� print(obj);�� ȣ���Ͽ� print
	
	obj.addStock(1000);//�޼��� ȣ��
	System.out.println("=====obj.addStock(1000)��=====");
	print(obj);
	
	obj.subtractStock(500);//�޼��� ȣ��
	System.out.println("=====obj.subtractStock(1000)��=====");
	print(obj);
}
//�޼��� �����
private static void print(GoodsStock obj) {//�Ű����� GoodsStock�� obj ������ ����Ұž�
	System.out.println("��ǰ�ڵ�:" + obj.goodsCode);//�ʵ尪 ���
	System.out.println("������:" + obj.stockNum);
	
}//�޼��带 ���� ����
}
