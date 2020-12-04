package clone12_01_03;

public class RectangleEx {
	public static void main(String args[]) {
		//객체 생성
		Rectangle obj1 = new Rectangle(10,20);
		//clone메서드로 객체를 복제
		Rectangle obj2 = (Rectangle) obj1.clone();
		//원본 객체와 복제 객체의 값으을 출력한다
		System.out.println("obj1 = "+ obj1.width + "x" + obj1.height);
		System.out.println("obj2 = "+ obj1.width + "x" + obj2.height);
		
		obj1.height = 100; obj1.width=200;
		System.out.println("obj1 = "+ obj1.width + "x" + obj1.height);
		System.out.println("obj2 = "+ obj1.width + "x" + obj2.height);
	}
	
	
}
