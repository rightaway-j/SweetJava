package Wrapper12_01_07;

public class test1solve {
	public static void main(String[] args) {
		int max = max(args);
		int min = min(args);

		System.out.println("최대값은=" + max);
		System.out.println("최소값은=" + min);

	}

	private static int max(String[] input) {
		int max = Integer.parseInt(input[0]);
		for (int cnt = 0; cnt < input.length; cnt++) {//배열로 한번에 뺴는것이 아닌 input[0] 인덱스에 맞춰서 하나씩 빼는 작업을 하면 int로 받을 수 있음
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
