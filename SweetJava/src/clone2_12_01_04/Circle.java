package clone2_12_01_04;

//implements �ڵ��ϼ� = im + ctrl + space bar
public class Circle implements Cloneable {
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle clone() {// ����� ��:Object�� =>Rectangle������ ����
		try {
			// ���� Ŭ������ clone�޼ҵ带 ȣ���ؼ� �װ���� ����
			return (Circle) super.clone();// ����� ��: Rectangle������ ��ȯ
		}
		// ���� Ŭ������ clone�޼ҵ尡 �߻��ϴ� �ͼ����� ó��
		catch (CloneNotSupportedException e) {
			return null;
		}

	}

	public String toString() {
		return "[p="+p+", r=" + r+ "]"; //p�� ������ �̴�.+�ȵ� ���� .toString(����)
				
	}

}
