package object11_23;

public class Saram6 {
	// �ʵ�(��� ����

	String name;
	int age;
	double w;
	double ki;
//	String name2;
	

	// ������-�ݵ�� Ŭ���� �̸����ǰ��� ���� Ÿ���� ������� 
	Saram6(String name, double w,double ki, int age) {//�����ڰ� �޶���
		/*
		 * this��?
		 * �ڹٴ� ��ü�� ������ �� �ֵ��� thisŰ���带 �����Ѵ�.
		 * ���������� �ν��Ͻ� �ڽ��� �ּҰ� ����Ǿ��ֽ��ϴ�.
		 * �����ڿ� ��� �ν��Ͻ� �޼��忡 ���������� ������ ä�� �����Ѵ�.
		 */
		this.name = name;
		this.w = w;
		this.ki = ki;
		this.age = age;

	}
//	Saram6(int age2){
//	age = age2;
//	}
//	
//	Saram6(double w2){
//	w = w2;
//	}
//	
//	Saram6(double ki2){
//	ki = ki2;
//	}

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
