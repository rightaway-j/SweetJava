package selectionSort_asc_11_23;

	//���� ���� - �ּ� ���� ����(��������)
	//���õ� �����Ϳ� �� �����͵� �� ���� ���� ���� ���Ѵ�.
	//���� ���� - �ּ� ���� ����(��������)

	//���õ� �����Ϳ� �� �����͵� �� ���� ���� ���� ���Ѵ�.

	public class selection01 {
		public static void main(String[] args) {
			int a[] = { 5, 4, 3, 2, 1 }; //ó���� �ٸ��ڸ����ִ°͵��� ���ؼ� ���� �͵��� ������ ��

			for (int i = 0; i < a.length - 1; i++) {//5������ 1������ ����Ǵ� -1
				System.out.println("\n" + "a[" + i + "]��° ������ ����, a[j]��°�� ��(a[" + i + "]>=a[j])�̸� �� ���� �ٲ۴�.");
				System.out.printf("%-37s", "���� ������ : ");
				for (int k = 0; k < a.length; k++)
					System.out.printf("%3d", a[k]);

				System.out.println();
				for (int j = i + 1; j < a.length; j++) {//0��°�� �����̴� �״��� �ڸ� 1���ͺ��ؾ��Ѵ� i +1 
					System.out.print("i = " + i + "\t" + "j = " + j + "\t" + "a[" + i + "]=" + a[i] + " > a[" + j + "]="
							+ a[j] + "  �� �� [");
					if (a[i] >= a[j]) {
						int imsi = a[i];
						a[i] = a[j];
						a[j] = imsi;
					} // if
					for (int k = 0; k < a.length; k++)
						System.out.printf("%3d", a[k]);
					System.out.println("  ]");
				} // for j
				System.out.println("================================");
			} // for i
		}

	}

