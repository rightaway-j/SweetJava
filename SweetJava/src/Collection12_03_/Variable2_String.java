package Collection12_03_;

public class Variable2_String {

	public static void main(String[] args) {
		//������-s1, s2 �� �޸� �ּ�, new�� ������,
		//new String("�ڹ�"); ���� String()�� ������
		String s1 = "�ڹ�";
		String s2 = new String("�ڹ�"); //String�� ���̺귯���� �����Ǵ� Ŭ���� 
		System.out.println("s1=" + s1 + " s2=" + s2);
		for(s1.equals(s2)) {
			System.out.println("����");
		}
		
	}
}
