package Wrapper12_01_07;
//wrapper��ü-> �⺻�� ������ �ڵ� (����)Unboxing�ϴ¿�
//�⺻���� ���� ��� �� �ڸ��� wrapper��ü�� ����ϸ�
// �� wrapper��ü�κ��� �⺻���� ���� �ڵ����� ����Ǿ� ����
public class auto_unboxing {
	public static void main(String args[]) {
		//���ڿ� "10"�� Wrqpper��ü Integer�� �ٲ�
		Integer obj = new Integer("10");
		
		//Integer ��ü�� int Ÿ���� ���� ���ϴ� ��ɹ�
		int sum = obj + 20; //�ڵ�(���� )Unboxing
		//int sum = ovj.intValue() + 20;
		System.out.println(sum);
		
	}
}
