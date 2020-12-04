package clone12_01_03;
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
	  * objectŬ������ ���ǵ� clone()
	  * protected Object clone() throws CloneNotSupportedException;
	  * ==> �������̵��� ���� ������ ����
	  * (protected => public: ��Ӱ��� ���� �ٸ� Ŭ�������� ȣ�� �� �� �ִ�.
	  */
	 public Object clone() {//��ȯ���� Object�� �̴�.
		 try {
			 //���� Ŭ������ clone�޼ҵ带 ȣ���ؼ� �װ���� ����
			 return super.clone();
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
