package Assignment;

public class dan_solve { //�� ����� �⺻�� ���� �ƴ� ������ �̷���� �ֱ⿡ ���η� �������ؼ� �ݺ����� ���������
	public static void main(String args[]) {
		for (int dan = 2; dan <=9; dan++)
			//Ÿ��Ʋ ���
			System.out.print("[" + dan + "��" + "\t");// �۲÷� ���� �ణ�� ��ġ ���� ���� �� �ִ�. \t�� 8ĭ �� ���
		System.out.println();
		//������ 
		for (int dan =2; dan <= 9; dan ++) {
			System.out.print(dan + "*" + 1 + "=" + 1 * dan + "\t"); //for���ȿ� for������ �ְ� ������ �����ؼ� ó��
		}
		
		System.out.println();//���ϴ°� ������ ������ ���ڿ���
		 //��� �� �� �پ� ���
		for (int i = 1; i <=9; i++) {
			System.out.println();
			for (int dan = 2; dan <=9; dan ++) {
				System.out.print(dan + "*" + i + "=" + i*dan + "\t ");
			}//dan end
		}// i end
	}//main end
}//class end
