package object_equals12_01_03;

public class Rectangle {
	 int width, height;
	 Rectangle(int width, int height){
		 this.width = width;
		 this.height = height;
	 }
	 public String toString() {
		 String result = "가로는 "+ width +",세로는"+ height;
		 return result;
	 }
	 public boolean equals(Object obj) {
		 if(obj !=null && obj instanceof Rectangle) { //r. =>다운캐스팅한것 
			 Rectangle r = (Rectangle) obj;
				return this.width == r.width && this.height == r.height; //참조변수가 2개이니까 &&로 묶어줌
				
			}else {
				return false;
			}
	 }
}
