package object_equals12_01_03;

public class Rectangle {
	 int width, height;
	 Rectangle(int width, int height){
		 this.width = width;
		 this.height = height;
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
