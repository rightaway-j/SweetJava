package Wrapper12_01_07;

public class test1solve {
	public static void main(String[] args) {
		int max = max(args);
		int min = min(args);

		System.out.println("�ִ밪��=" + max);
		System.out.println("�ּҰ���=" + min);

	}

	private static int max(String[] input) {
		int max = Integer.parseInt(input[0]);
		for (int cnt = 0; cnt < input.length; cnt++) {//�迭�� �ѹ��� ���°��� �ƴ� input[0] �ε����� ���缭 �ϳ��� ���� �۾��� �ϸ� int�� ���� �� ����
			int data = Integer.parseInt(input[cnt]);
			max = max < data ? data : max;
		}
		return max;
	}

	private static int min(String[] input) {
		int min = Integer.parseInt(input[0]);
		for (int cnt = 0; cnt < input.length; cnt++) {
			int data = Integer.parseInt(input[cnt]);
			min = min > data ? data : min;
		}
		return min;
	}
}
