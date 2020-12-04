package Math_11_30;

//0이상 1미만의 난수 발생하는 프로그램 파일을 난수로 만들고 눈에 보이는 것은파일 이름 
public class Math_round_test_lotto {
	public static void main(String args[]) {
		// 중복된 데이터 확인하고자 배열 사용함
		int[] num = make();
		sortAsc(num);
		System.out.println("===================정렬후=================");
		print(num);
	}// 메인

	private static int[] make() {
		int num[] = new int[6];
		for (int i = 0; i < num.length; i++) { // i=0일때 ㅑ=1
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
