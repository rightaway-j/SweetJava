package conditional_loop; 

import java.util.Scanner;

public class Switch_Score {
	public static void main(String args[]) {
		System.out.println("������ �Է��ϼ���>");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt(); // s= 95;
//���� ������ �ʰ� ����Ϸ��� int jumsu�ڸ��� mok �� �־��ش�.
		int mok = jumsu / 10;   //�� ���� ������� ������������ ÷���� �� �־��ְ� ����ġ�� ���� ������
		switch (mok) {

		case 9:
		case 10:
			System.out.println("A����");
			break;
		case 8:
			System.out.println("B����");
			break;
		case 7:
			System.out.println("C����");
			break;
		case 6:
			System.out.println("D����");
			break;
		default :
			System.out.println("F����");
			
	
			System.out.println("��.");

		}
		sc.close();
	}
}
