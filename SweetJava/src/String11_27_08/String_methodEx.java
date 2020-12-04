package String11_27_08;

import java.util.Scanner;

public class String_methodEx {
	public static void main(String args[]) {
		/*
		 * 1. main()�޼��� (1) Scanner ��ü �����մϴ�. (2) ���� �ݺ� �����մϴ�. - 3~6 �ݺ��մϴ�. (3)
		 * "�ֹι�ȣ �Է� (exit=e): "����մϴ�. (4) �ֹι�ȣ �Է� �޽��ϴ�. (5) �Է� ���ڿ��� "e"�̸� "�����մϴ�." ����ϰ�
		 * �ݺ��� ����ϴ�. (6) printCheck(zumin) ȣ���մϴ�.
		 */
		
		String zumin;

		do {
			System.out.println("�ֹι�ȣ �Է� (exit=e): ");
			Scanner sc = new Scanner(System.in);
			zumin = sc.next();
		} while (!(zumin.equals("e")));
		System.out.println("�����մϴ�");
		printCheck(zumin);// printCheck(zimin)ȣ��
	}

	/*
	 * 2. �޼��� �̸� : checkLength �Ű����� : �Է� ���� �ֹι�ȣ(String) ��� : �Է¹��� �ֹι�ȣ ���̰� 14������
	 * �Ǵ�(14���̸� true, �ƴϸ� false) ��ȯ�� : boolean
	 */

	static boolean checkLength(String zumin) {
		if (zumin.length() == 14) {
			return true;
		} else
			return false;
	}
	/*
	 * �ٸ� ��� return zumin.length() == 14? true : false;
	 */

	/*
	 * 3. �޼��� �̸� : checkHyphen �Ű����� : �Է� ���� �ֹι�ȣ(String) ��� : �Է¹��� �ֹι�ȣ�� 7��° ���ڰ�
	 * '-'���� �Ǵ�('-'�̸� true, �ƴϸ� false) ��ȯ�� : boolean
	 */
	static boolean checkHyphen(String zumin) {
		String s = zumin.substring(6, 7);
		if (s.equals("-")) {
			return true;
		} else
			return false;

	}
	// �ٸ� ���
	// return zumin.substring(6,7).equals("-")?true:false;
/*
 * 5. �޼��� �̸� : select
   �Ű����� : ���ڸ� ù���ڸ� �޴� ���ڿ�
   ��� : �Ű������� ���� "1" �Ǵ� "3"�̸� "����", "2" �Ǵ� "4"�̸� "����" �� �ܴ� "�ܱ���" ����
   ��ȯ�� : String

 */
	static String select(String n) {
		// TODO Auto-generated method stub
		String result = "�ܱ���";
		switch (n) {
		case "1":
		case "3":
			result = "����";
			break;
		case "2":
		case "4":
			result = "����";
		}
		
		return result;
	}
	/*
	 * 4. �޼��� �̸� : isNumber �Ű����� : �Է� ���� �ֹι�ȣ(String) ��� : �Ű������� ���� null�̰ų�
	 * ""(���ڿ�)�̸� false ���� �ƴ� ��쿡�� �Ű������� ��� ���ڰ� �������� �Ǵ��ؼ� ���ڰ� �ƴϸ� false ���� �����̸� true
	 * ���� ��ȯ�� : boolean
	 */

	public static boolean isNumber(String str) {
		if (str == null || str.contentEquals(""))
			return false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		} // for end
		return true;
	}
	// isnumber end

/*	boolean isNumber(String zumin) {
//		if(zumin.contentEquals(null)|| zumin.equals("")) {
//			return false;
//		}else if () {
//			
//			int len = zumin.length();
//			
//			for(int cnt = 0; cnt < len; cnt++) {
//				char ch = zumin.charAt(cnt);
//				
//				ch < 10;
//			
//		}
//		

	// else if(int a < 10) {
// (!(zumin.substring(1,7) && zumin.substring(8,13) int))}
	/*
	 * 5. �޼��� �̸� : select �Ű����� : ���ڸ� ù���ڸ� �޴� ���ڿ� ��� : �Ű������� ���� "1" �Ǵ� "3"�̸� "����",
	 * "2" �Ǵ� "4"�̸� "����" �� �ܴ� "�ܱ���" ���� ��ȯ�� : String
	 */

	private static void printCheck(String zumin) {
		if (!checkLength(zumin)) {
			System.out.println("�ֹι�ȣ ���̴� 14�� �Դϴ�.");

		} else if (!checkHyphen(zumin)) {
			System.out.println("�ֹι�ȣ ���Ŀ� ���� �ʽ��ϴ�.(-��ġ).");
		} else if (!isNumber(zumin.substring(0, 6))) {
			System.out.println("���ڸ��� ���ڸ� �Է��ϼ���");
		} else if (!isNumber(zumin.substring(7, 14))) {
			System.out.println("���ڸ��� ���ڸ� �Է��ϼ���");
		} else {
			String n = zumin.substring(7, 8);
			System.out.println(select(n));
		}
	}

}
/*
 * 6. �޼��� �̸� : printCheck �Ű����� : �Է� ���� �ֹι�ȣ(String) ��� : checkLength()�� �����̸�
 * "�ֹι�ȣ ���̴� 14�� �Դϴ�." checkLength()�� ������ �ƴ� ��� checkHyphen()�� �����̸�
 * "�ֹι�ȣ ���Ŀ� ���� �ʽ��ϴ�.(-��ġ)" checkHyphen()�� ������ �ƴ� ��� isNumber(���ڸ�6�ڸ�)�� �����̸�
 * "���ڸ��� ���ڸ� �Է��ϼ���" isNumber(���ڸ�6�ڸ�)�� ������ �ƴ� ��� isNumber(���ڸ�7�ڸ�)�� �����̸�
 * "���ڸ��� ���ڸ� �Է��ϼ���" isNumber(���ڸ�7�ڸ�)�� ������ �ƴ� ��� ������������ ���� �����ؼ� �Ǵ��ϴ� select()ȣ��
 * ��ȯ�� : void
 */
