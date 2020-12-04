package deepcopy12_01_05;

//implements �ڵ��ϼ� = im + ctrl + space bar
public class Circle implements Cloneable {
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
//���� ���� - ������ �����ϰ� �ִ� ��ü���� ����
	public Circle clone() {
	Object obj= null;
		try {
			obj = super.clone();//������ clone()�� ȣ��
		}
		
		catch (CloneNotSupportedException e) {
			System.out.println("������ ���� �Դϴ�.");
			return null; //null�� ��ȯ�Ǹ� �Ʒ� �� ��� �ȵ�
		}
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;

		

	}

	public String toString() {
		return "[p="+p+", r=" + r+ "]"; //p�� ������ �̴�.+�ȵ� ���� .toString(����)
				
	}

}
