package object11_24;

public class GoodsStock_Example1 {
public static void main(String args[]) {
	GoodsStock obj; // ���� ����
	obj = new GoodsStock(); //��ü ����
	//GoodsStock obj = new GoodsSTock();
	
	obj.goodsCode = "52135";//�ʵ忡 ���� ����
	obj.stockNum = 200;//�ʵ忡 ���� ����
	System.out.println("��ǰ�ڵ�:" + obj.goodsCode);//�ʵ尪 ���
	System.out.println("������:" + obj.stockNum);
	
	obj.addStock(1000);//�޼��� ȣ��
	System.out.println("=====obj.addStock(1000)��=====");
	System.out.println("��ǰ�ڵ�:" +  obj.goodsCode);
	System.out.println("������:" +  obj.stockNum);
	
	obj.subtractStock(500);//�޼��� ȣ��
	System.out.println("=====obj.subtractStock(1000)��=====");
	System.out.println("��ǰ�ڵ�:" +  obj.goodsCode);
	System.out.println("������:" +  obj.stockNum);
}
}
