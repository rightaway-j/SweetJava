package Math_11_30;

//0�̻� 1�̸��� ���� �߻��ϴ� ���α׷� ������ ������ ����� ���� ���̴� �������� �̸� 
public class Math_round_test_lotto {
	public static void main(String args[]) {
		// �ߺ��� ������ Ȯ���ϰ��� �迭 �����
		int[] num = make();
		sortAsc(num);
		System.out.println("===================������=================");
		print(num);
	}// ����

	private static int[] make() {
		int num[] = new int[6];
		for (int i = 0; i < num.length; i++) { // i=0�϶� ��=1
			num[i] = (int) (Math.random() * 45 + 1);// num[0]=30 num[1]=30
			for (int j = 0; j < i; j++) { // j=0
				if (num[i] == num[j]) { // num[1] == num
					i--; // i = 0
					break;
				}
			} // j for end
		} // i for end
		return num;
	}

	private static void sortAsc(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int imsi = num[i];
					num[i] = num[j];
					num[j] = imsi;

				}

			}

		}
	}// sortAsc

	private static void print(int[] num) {
		for (int k : num) {
			System.out.print(k + "\t");
		}
	}// print
}
