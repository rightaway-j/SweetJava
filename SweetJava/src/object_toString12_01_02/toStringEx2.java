package object_toString12_01_02;

public class toStringEx2 {
	public static void main(String args[]) {
		GoodsStock obj = new GoodsStock("73623",200);
		String str = "�������=" + obj;
		/*
		 *���ڿ��� goodstock ��ü ������ +�����ڷ� �����ϸ� �� ��ü�� toString �޼��尡 �ڵ����� ȣ��� �� ���ڿ��� �����.
		 *String str = "�������=" +obj.toString()
		 goodsstock �� �ִ� �޼��� �����ͼ� ������ ��
		 */
		System.out.println(str);
	}
}
