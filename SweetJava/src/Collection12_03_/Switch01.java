//package com.naver.myhome;
//
//public class Switch01 {
//	public static void main(String args[]) {
//		int num1 = 52;
//		int num2 = 24;
//		if (num1 < num2)  // �ι����� �����Ұ�� �߰�ȣ�� ���ش� - �Խ� ���
//			System.out.println("num1 ���� �� Ů�ϴ�.");
//		System.out.println("num1 = " + num1); //�����̱⿡ if������ �����ͼ� �ٸ��� ����
//		
//		System.out.println("End.");
//	}
//}
//========================================
//package com.naver.myhome;
//
//public class Switch01 {
//	public static void main(String args[]) {
//		int num1 = 52;
//		int num2 = 24;
//		if (num1 < num2) {
//			System.out.println("num1 ���� �� Ů�ϴ�.");
//			System.out.println("num1 = " + num1);
//		}
//		System.out.println("End.");
//	}
//}
//=====================================
//package com.naver.myhome;
//
//public class Switch01 {
//	public static void main(String args[]) {
//		int num1 = 52;
//		int num2 = 24;
//		if (num1 < num2) 
//			System.out.println("num1 = " + num1);
//		else
//			System.out.println("num2 = " + num2);
//		
//		System.out.println("End.");
//	}
//}
//=============================================
package Collection12_03_;

public class Switch01 {
	public static void main(String args[]) {
		int num1 = 52;
		int num2 = 24;
		int num3 = 32;
//		
//		if (num1 > num2)  {
//			if (num1 > num3)
//			System.out.println("num1 �� ����Ů�ϴ�.");
//		}
//		
//			//�� ������ �� ����  if ���� &&�����ڷ� �ٲپ� �ּ���.
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 �� ����Ů�ϴ�."); //�߰�ȣ�� ���°� - �̰� ���� �ض�
		}
		System.out.println("End.");
	}
}

