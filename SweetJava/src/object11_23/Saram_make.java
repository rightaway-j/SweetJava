package object11_23;

public class Saram_make {
	public static void main(String[]args) {
		/*
		 * �ٸ� Ŭ������ �ִ� �ʵ峪 �޼���(���)�� ����Ϸ��� ���� ��ü�� �����ؾ� �մϴ�.
		 * ������ ��ü ����� �����Ϸ��� ��ħǥ(.)�����ڸ� ����մϴ�.
		 * ��)��ü.�ʵ�, ��ü.�޼���()
		 */
		Saram s = new Saram();
		s.name="����";
		s.w=47.4;
		s.ki=168;
		s.age=27;
		s.eat();
		
		Saram p = new Saram();
		p.name="�ں���";
		p.w=60.3;
		p.ki= 173;
		p.age=29;
		p.eat();
		
		Saram m = new Saram();
		m.name="������";
		m.w=60;
		m.ki=168;
		m.age=26;
		m.eat();
		m.sesu();
		
	}
}
