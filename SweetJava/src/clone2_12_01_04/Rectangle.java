package clone2_12_01_04;
//���� ������ Ŭ������ �����
//1�ܰ� - Cloneable �������̽� ���� -implements Cloneable
//2�ܰ� - clone()�޼ҵ�������̵��ϱ�
public class Rectangle implements Cloneable{
	//Cloneable �������̽��� �����Ǿ� �ִٴ� ���� Ŭ���� �ۼ��ڰ� ������ ����Ѵٴ� �ǹ�.
	 int width, height;
	 Rectangle(int width, int height){
		 this.width = width;
		 this.height = height;
	 }
	 
	 /*
	  * ���� ��ȯ Ÿ��(covariant return type)JDK1.5���� ����
	  * �������̵� �� �� ���� �޼����� ��ȯŸ���� �ڼ� Ŭ������ Ÿ������ ������ ���
	  * ��, ��ȯ���� object���� �ڼ� Ŭ���� Ÿ������ ������ ���
	  * ������:clone()ȣ�� �� �� ��ȯ���ʿ� ����(main�޼���)
	  * Rectangle obj2 = (Rectangle)obj1.clone();
	  * ==> Rectangle ovj2 = obj1.clone();
	  */�̷��� ���������ν� �ٿ�ĳ������ �ʿ������
	  */
	 public Rectangle clone() {//����� ��:Object�� =>Rectangle������ ����
		 try {
			 //���� Ŭ������ clone�޼ҵ带 ȣ���ؼ� �װ���� ����
			 return(Rectangle) super.clone();//����� ��: Rectangle������ ��ȯ
		 }
		 //���� Ŭ������ clone�޼ҵ尡 �߻��ϴ� �ͼ����� ó��
		 catch(CloneNotSupportedException e) {
			 return null;
		 }
	 }
	 
	 public String toString() {
		 String result = "���δ� "+ width +",���δ�"+ height;
		 return result;
	 }
	 public boolean equals(Object obj) {
		 if(obj !=null && obj instanceof Rectangle) { //r. =>�ٿ�ĳ�����Ѱ� 
			 Rectangle r = (Rectangle) obj;
				return this.width == r.width && this.height == r.height; //���������� 2���̴ϱ� &&�� ������
				
			}else {
				return false;
			}
	 }
}
