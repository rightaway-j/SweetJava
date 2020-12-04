package Array;

public class test_array01_total {
	public static void main(String args[]) {
		int[] score = { 95, 70, 80, 75, 100 };

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			// for (int i = 0; i < score.length ;i++) 로 사용하는것이 좋음
			System.out.println("Score[" + i + "]= " + score[i]);
			sum += score[i]; // 총점 더하는걸 여기에 넣는다. check하기

		}
		System.out.println("총점=" + sum);
	}
}
