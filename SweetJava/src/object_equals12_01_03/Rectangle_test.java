package object_equals12_01_03;

public class Rectangle_test {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(10,30);
		Rectangle r2 = new Rectangle(10,30);
		System.out.println(r1);
		System.out.println(r2);
		if(r1.equals(r2))//오버라이딩 되었다.
			System.out.println("r1.equals(r2):같음");
		else
			System.out.println("r1.equals(r2):다름");
		
		if(r1 == r2)
			
			System.out.println("r1==r2:같음");
		else
			System.out.println("r1==r2:다름");
			
	}
}
