package Math_11_30;

//0�̻� 1�̸��� ���� �߻��ϴ� ���α׷� ������ ������ ����� ���� ���̴� �������� �̸� 
public class Math_round_test_lotto_solve {
	public static void main(String args[]) {
		System.out.println(Math.random());// 0<=����<1:double��
		System.out.println(Math.random());
		System.out.println(Math.random());
		int num;
		/*
		 * 0���� 9 ������ ���� ������ ���ϴ� �������� ����� 1. 0<= ����<1 2. 0<= ����*10 <10 3.0<= (int)(����*10)
		 * < 10==> ������ �����
		 * 
		 */
		// ����:(����ȭ)((���Ѱ�- ���Ѱ�+1)*����+���Ѱ�)
		// (int)((9-0+1)*���� +0)
		num = (int) (Math.random() * 10);
		System.out.println(num);

		for (int n = 0; n < 6; n++) {
			num = (int) ((45 - 1 + 1) * Math.random() + 1); // n���� for���� 6�� ������ �� 6�� ���� ���ȿ� num ������ ���� 6�� ����
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("===========���� �� ===========");

		for (int i = 0; i < 6; i++) {
			num = (int) (Math.random() * 45 + 1);

			int[] a = {num};
			System.out.println(a[0]);
			
//		int[] a = { num };
//		for (int n = 0; n <= 5; n++) {
//			for (int s = 1; s <= 5; s++) {
//				if (a[n]==(a[s])) {
//					return;
//				}
//				else System.out.print(num + " ");
//			}
			}
		}
	}

