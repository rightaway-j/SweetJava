package break_;

public class break01 {
	public static void main(String args[]) {

		for (int cnt =0; cnt < 10; cnt++) {
			System.out.println(cnt);
			if (cnt == 5)//������ �����ϸ� �����
				break; // break�� �����ϴ� �ݺ��� ������ ��� �̵��ȴ�.
		}
		System.out.println("End.");
	}
}
