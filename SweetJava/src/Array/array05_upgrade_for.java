package Array;

public class array05_upgrade_for {
	public static void main(String args[]) {
		String name[] = {"ȫ�浿","�̼���","�������"};
		
		
		//���� for��, Ȯ��for�� (jdk1.5�̻�)
		for (String na : name) {
			System.out.println(na);
		}
		//���� for��
		for(int i= 0; i<name.length; i++)
		System.out.println(name[i]);
		
	}
	
}
