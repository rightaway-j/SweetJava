package method11_23Mon;

public class method02 {
	// ����������     ��ü�������� �ʰ� ����ϱ�����/method�̸�(�Ű����� ���)
	public static void main(String args[]) { //���⵵ method�� �ϳ��̴�. jvm�� ȣ������.
		//�޼��� ȣ�� ���1 - ũ������, �����޼���(static�� ������ ����)
		method02.printCharacter('*', 30);//�޼��� ȣ��(�Ű������� �־��� ���� Ÿ��,���� �����ش�)//���� argument
		
		return;//��ȯ���� void�ΰ�� ��������.�����ִ� ���, ���� ȣ������ ������ ���� - jvm
		
		
		
	}	
	//method���� //�����صΰ� main���� �������ش�.-���๮�� main�� �־������
	public static void printCharacter(char ch, int num) {	//�Ű��������� ���� �ʿ��� ���� �־���
		for(int cnt = 0; cnt<num; cnt++)
			System.out.print(ch);
		System.out.println();
		return;//��ȯ���� void �� ��� ���� �����ϴ�.
		
		
	}
}
