
//�������� import������ �����ϴ� Ŭ����
package math11_27_03;
import geometry_11_27_04.Circle;
import geometry.polygon11_27_03.Rectangle;//geometry*����ϸ� �� geometry�������� ������ ���(*�� ������ ������ �ƴϴ�.//import���� = �ٸ� ��Ű���� �̰Ÿ� ����Ұž�~
//ctrl + shift + o
class PackageEx_geometry2 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Rectangle obj2 = new Rectangle(8,9);
		if (obj1.getArea() > obj2.getArea())
		System.out.println("���� ������ �� �н��ϴ�. " );
	else
		System.out.println("���� ������ ���簢���� �������� �۰ų� �����ϴ�." );
	}
}
