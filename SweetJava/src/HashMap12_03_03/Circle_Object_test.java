package HashMap12_03_03;

public class Circle_Object_test {
public static void main(String[] args) {
	Circle c1 = new Circle(5);
	Circle c2 = new Circle(5);
	
	//int java.lang.Object.hashCode()
	//���δٸ� ��ü�� ���� ���� �ؽ��ڵ带 ���� �� ����
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
}
}
