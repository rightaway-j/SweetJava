package method11_23Mon;

public class method04 {
	// ����������     ��ü�������� �ʰ� ����ϱ�����/method�̸�(�Ű����� ���)
	public static void main(String args[]) { //main�� �ڵ����� ���۵Ǵ� ������/���⵵ method�� �ϳ��̴�. jvm�� ȣ������. //void -���� �����ٰ� ���ٶ�� ��
		//�޼��� ȣ�� ���1 - ũ������, �����޼���(static�� ������ ����)
		method04.printCharacter('*', 30);
		
		//methodȣ���� 2.
		printCharacter('-', 30);//����
		System.out.println("Hello, java");
		printCharacter('-', 30);
		printCharacter('*', 30);
	
		return;//return;//��ȯ���� void�ΰ�� ��������.�����ִ� ���, ���� ȣ������ ������ ���� - jvm
		
		
	}	
	//method���� //�����صΰ� main���� �������ش�.-���๮�� main�� �־������
	public static void printCharacter(char ch, int num) {	//�����//�Ű�����(parameter)���� ���� �ʿ��� ���� �־���(���� ���� �մ�)
		for(int cnt = 0; cnt<num; cnt++)//������
			System.out.print(ch);
		System.out.println();
		return;//��ȯ���� void �� ��� ���� �����ϴ�.
		
		
	}
}
