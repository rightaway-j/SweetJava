package object11_23;

public class Saram_make3 {
	public static void main(String[]args) {
		/*
		 * �ٸ� Ŭ������ �ִ� �ʵ峪 �޼���(���)�� ����Ϸ��� ���� ��ü�� �����ؾ� �մϴ�.
		 * ������ ��ü ����� �����Ϸ��� ��ħǥ(.)�����ڸ� ����մϴ�.
		 * ��)��ü.�ʵ�, ��ü.�޼���()
		 */
		Saram3 s = new Saram3("����");//()��ȣ �ȿ� ���ϴ� ������ �����͸� �ִ´�
		//s.name="����";
		s.w=47.4;
		s.ki=168;
		s.age=27;
		s.eat();
		s.sesu();
		s.walk();
		
		Saram3 p = new Saram3("�ں���");
		//p.name="�ں���";
		p.w=60.3;
		p.ki= 173;
		p.age=29;
		p.eat();
		p.sesu();
		p.walk();
		
		
		Saram3 m = new Saram3("������");
		//m.name="������";
		m.w=60;
		m.ki=168;
		m.age=26;
		m.eat();
		m.sesu();
		m.walk();
		
	}
}
