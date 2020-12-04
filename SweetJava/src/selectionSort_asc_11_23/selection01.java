package selectionSort_asc_11_23;

	//선택 정렬 - 최소 선택 정렬(오름차순)
	//선택된 데이터에 비교 데이터들 중 가장 작은 값을 구한다.
	//선택 정렬 - 최소 선택 정렬(오름차순)

	//선택된 데이터에 비교 데이터들 중 가장 작은 값을 구한다.

	public class selection01 {
		public static void main(String[] args) {
			int a[] = { 5, 4, 3, 2, 1 }; //처음과 다른자리에있는것들을 비교해서 작은 것들을 앞으로 뺌

			for (int i = 0; i < a.length - 1; i++) {//5번보다 1번적게 돌면되니 -1
				System.out.println("\n" + "a[" + i + "]번째 데이터 선택, a[j]번째와 비교(a[" + i + "]>=a[j])이면 두 수를 바꾼다.");
				System.out.printf("%-37s", "원본 데이터 : ");
				for (int k = 0; k < a.length; k++)
					System.out.printf("%3d", a[k]);

				System.out.println();
				for (int j = i + 1; j < a.length; j++) {//0번째는 고정이니 그다음 자리 1부터비교해야한다 i +1 
					System.out.print("i = " + i + "\t" + "j = " + j + "\t" + "a[" + i + "]=" + a[i] + " > a[" + j + "]="
							+ a[j] + "  비교 후 [");
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

