package GoodsStockTest11_24;
/*Ŭ���� �̸�: GoodStock
 * 1.�ʵ�
 * goodsCode(��ǰ�ڵ�: String)
 * stockNum(��� ���� : int)
 * 
 * 2.�Ű� �������� ������
 * ù��° �谳 ����: String
 * �ι�° �Ű�����:int
 * 3.�޼���
 * �ϳ�) �̸�: addStock
 * �Ű����� : ������ �Ѱ�
 * ���:
 * �Ű� ������ ���� ���� ������ ��� �������� ���Ѵ�.
 * ��ȯ��: void
 * S
 * ��) subtractStock
 * �Ű����� : ������ �Ѱ�
 * ���1) �Ű� ������ ���� ���� ��� ���� ������ ũ�ٸ� 0�� �����ϰ� �޼��� ���� �Ѵ�.
 * 	2)�Ű� ������ ���� ���� ��� ���������� ũ�� ������ �ް� ������ ���� ���� ������ ��� ���������� ���� �谳 ���� ���� �����Ϻ��.
 * ��ȯ��: �Ű����� �� ��(int)
 */
public class GoodsStock {//Ŭ������ ������ �����ϴ� Ű����
	String goodsCode;//��ǰ �ڵ�
	int stockNum;//��� ����
	/*
	//������-�ν��Ͻ��� ������ �� ȣ��Ǵ� ' �ν��Ͻ� �ʱ�ȭ �޼���'�̴�
	���� �ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���Ǹ� �ν��Ͻ� �����ÿ� ����Ǿ�� �� �۾��� ���ؼ��� ����.
	�����ڵ� �����ε��� ����, �������� �����ڰ� ���� �Ҽ� ����
	����=�޼��������� ���� ���̾���./ �������� �̸��� Ŭ������ �̸��� ���ƾ���
	public GoodStock() {//2�� ,������ �ۼ�(Ŭ�������� ����), �޼��� �ȿ� �޼��� �ȵ�
	====================================================================
	�Ű������� ���� ������ - �⺻ ������
	Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� ���� �Ǿ� �־�� ��/
	���ڰ� ���� ��� �ڵ����� �߰���(�⺻�����ڶ� �Ҹ�)
	�Ű������� �ִ� �����ڰ� �Ѱ��� �ۼ��� ��쿡�� �⺻ �����ڴ� �ڵ��߰����� �ʽ��ϴ�.
	*/

 GoodsStock(String code, int num){ //GoodsStock(){}�̷��� �Ǿ� ������ �ּ�ó���ص�(���)�� ������ش�(��, �����ڰ� (�Ű�����)�ϳ��� ���� ���)
	 goodsCode = code;
	 stockNum = num;
}
 void addStock(int amount) {//����� ���Ѵ� ��ɿ� �ش��ϴ� �޼ҵ�
	 stockNum += amount;
 }//��ȯ�� void
 int subtractStock(int amount) {//����� ���� ��ɿ� �ش��ϴ� �޼ҵ�
	 if (stockNum <amount)
		 return 0;
	 stockNum -= amount;
	 return amount; //��ȯ�� int
 }
		 
	 
 }

 