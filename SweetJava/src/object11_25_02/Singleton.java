package object11_25_02;

public class Singleton {
	//�ʵ� s�� �ܺο��� ��� ����
	//�� ������ ó�� singleton Ŭ������ jvm�� �ε��� �� �� ���� �����
	private static Singleton a = new Singleton(); //static = �����̶�� ��
//private: �ܺο��� �����ڸ� ȣ���� �� ������ ���´�.	
	private Singleton() {} //�ʱ�ȭ
/*
 * �̱���(singleton)
 * �ϳ��� ���ø����̼� ������ �� �ϳ��� �����Ǵ� ��ü
 * 
 */
	public static Singleton getInstance() {
		System.out.println("����� getInstance �Դϴ�");
		return a;
		
		
		
	}
}
