package reference11_26_09;
//���۷��� ������ null�������� ���ؼ� ó���ϴ� ���α׷�
public class RefTypeEx2 {
	public static void main(String args[]) {
		//Point obj = null;//�������� �ʱ�ȭ�۾� �ؾ���.
		Point obj = new Point(3,4);
		//the local variable obj may not have been initialized
		if (obj == null) {
			System.out.println("obj ������ ����Ű�� ��ü�� �����ϴ�"); //heap ������ ����Ű�°��� ���µ� ���̾Ƴ���� ���� ���´�.
		return;
		}else {
			System.out.println("x = " + obj.x);
			System.out.println("y = " + obj.y);
		}
	}

}
