package Assignment;

public class calender_solve_02 {
	public static void main(String args[]) {
		System.out.println("\n===========================");
		for (int i = -1; i <= 31; i++) {
			if (i <= 0)

				System.out.printf("%5s", ""); //0아래의 숫자가 나오지 않는 이유?
			else
				System.out.printf("%5d", i); // d와 s의 사용이 다른이유?

			if (i % 7 == 5) // 5 일때는 줄 바꿔라 (한줄에 5)

				System.out.println();
		}
	}
}