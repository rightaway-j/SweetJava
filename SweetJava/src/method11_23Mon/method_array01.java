/*
 * �迭�� �̿��� �ִ밪, �ּҰ� ���ϱ�
 * ���� ������ �����ϴ� �޼��带 ������ ���ÿ�
 * 1.main()
 * 1)������ �迭data����
 * 2)�迭 data�� ũ��� 5 
 * 3)���� 5���� �Է¹޾� �迭 data�� ���ʴ�� ����
 * 4)max(data)�޼��带 ȣ��
 * ���ȭ��)�ִ� = �Է¹��� �� �� ���� ū ��
 * 
 * 2.max()
 * ���) ���ڷ� ���� data�� �� �� �߿��� �ִ밪�� ���Ѵ�
 * ���ϰ�)�ִ밪
 */
//package method11_23Mon;
//
//import java.util.Scanner;
//
//public class method_array01 {
//	public static void main(String[] args) {
//		int[] su = new int[5];
//		
//		System.out.println("���� 5���� �Է��Ͻÿ�.>");
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < su.length; i ++) {
//			su[i] = sc.nextInt();
//		}
//	
//		
//	}
//
//	public static int max(data) {
//		int max = su[0];
//	}
//
//	public static int min() {
//		
//	}
//}
package method11_23Mon;

import java.util.Scanner;

public class method_array01 {
	public static void main(String[] args) {
		int data[]  = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��Ͻÿ�.>");
		
		for(int i = 0; i < data.length; i ++) {
			data[i] = sc.nextInt();
		}
		System.out.println("�ִ�=" + max(data));
		System.out.println("�ּڰ�=" + min(data));
		sc.close();
	
		
	}

	public static int max(int data[]) {
		int max = data[0];
		for(int i=1; i< data.length; i++) {
			if (max < data[i])
				max = data[i];
			
		}
		return max;
	}

	public static int min(int data[]) {
		int min = data[0];
		for(int i=1; i< data.length; i++) {
			if (min > data[i])
				min = data[i];
			
		}
		return min;
	}
}
