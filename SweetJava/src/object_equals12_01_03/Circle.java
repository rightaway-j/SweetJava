package object_equals12_01_03;
public class Circle {
	int radius; // ������

	Circle(int radius) {
		this.radius = radius;

	}
	public String toString() {
		return "radius=" + radius;

	}
	//obj�� object Ÿ���̹Ƿ� radius�� �����ϱ� ���ؼ� CircleŸ����������ȯ�� �ʿ�
	public boolean equals(Object obj) {
	 //obj. ���� =�ڼտ� �ִ� radius���� ����ϱ����� downcasting �������
		
		/*
		 * obj��null�� �ƴϰ� obj�� Circle�� ����ȯ �������� üũ�Ѵ�.
		 * ������ �����ϸ� obj�� Circle�� ����ȯ�ϰ� 
		 * ����ȯ��obj�� radius���� ���� ��ü�� radius���� ���ؼ� ������ 
		 * true�� �ƴϸ� false�� �����Ѵ�.
		 */
		if(obj !=null && obj instanceof Circle) {
			Circle obj2 = (Circle) obj;
			return this.radius == obj2.radius;
		}else {
			return false;
		}
	}
}
