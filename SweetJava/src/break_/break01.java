package break_;

public class break01 {
	public static void main(String args[]) {

		for (int cnt =0; cnt < 10; cnt++) {
			System.out.println(cnt);
			if (cnt == 5)//조건을 만족하면 벗어나라
				break; // break를 내포하느 반복문 밖으로 제어가 이동된다.
		}
		System.out.println("End.");
	}
}
