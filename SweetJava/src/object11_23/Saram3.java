package object11_23;

public class Saram3 {
	// �ʵ�(��� ����

	String name;
	int age;
	double w;
	double ki;
//	String name2;
	

	// ������-�ݵ�� Ŭ���� �̸����ǰ��� ���� Ÿ���� ������� 
	Saram3(String name2) {//�����ڰ� �޶���
		name = name2;

	}

	// �޼���
	public void eat() {//static�� ����.�����޼ҵ尡 �ƴϴ�.
		System.out.println(name + "��(��) ���� �Դ´�.");
	}

	// �޼���
	public void walk() {
		System.out.println(name + "��(��) �ȴ´�.");
	}
//�޼���
	public void sesu() {
		System.out.println(name + "��(��) �����Ѵ�");

	}

}
