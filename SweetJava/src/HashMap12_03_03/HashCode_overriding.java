package HashMap12_03_03;

public class HashCode_overriding {
public static void main(String[]args) {
	String str1 = new String("abc"); //�������̵� �� String�� ����ޱ⶧��
	String str2 = new String("abc");
	
	//String Ŭ������ ���ڿ��� ������ ������ ������ �ؽ��ڵ带 ��ȯ�ϵ��� 
	//hashCode�޼��尡 �������̵��Ǿ� �ֱ� ������
	//���ڿ��� ������ ����str1�� str2�� ���� hashCode()�� ȣ�߶���
	//�׻� ������ �ؽ��ڵ尪�� ��´�.
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
}
}
