package clone2_12_01_04;
//복제 가능한 클래스로 만들기
//1단계 - Cloneable 인터페이스 구현 -implements Cloneable
//2단계 - clone()메소드오버라이드하기
public class Rectangle implements Cloneable{
	//Cloneable 인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미.
	 int width, height;
	 Rectangle(int width, int height){
		 this.width = width;
		 this.height = height;
	 }
	 
	 /*
	  * 공변 반환 타입(covariant return type)JDK1.5부터 적용
	  * 오버라이딩 할 떄 조상 메서드의 반환타입을 자손 클래스의 타입으로 변경을 허용
	  * 즉, 반환형을 object에서 자손 클래스 타입으로 변경을 허용
	  * 좋은점:clone()호출 후 형 변환이필요 없다(main메서드)
	  * Rectangle obj2 = (Rectangle)obj1.clone();
	  * ==> Rectangle ovj2 = obj1.clone();
	  */이렇게 변경함으로써 다운캐스팅이 필요없어짐
	  */
	 public Rectangle clone() {//변경된 곳:Object형 =>Rectangle형으로 변경
		 try {
			 //슈퍼 클래스의 clone메소드를 호출해서 그결과를 리턴
			 return(Rectangle) super.clone();//변경된 곳: Rectangle형으로 변환
		 }
		 //슈퍼 클래스의 clone메소드가 발생하는 익셉션을 처리
		 catch(CloneNotSupportedException e) {
			 return null;
		 }
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
