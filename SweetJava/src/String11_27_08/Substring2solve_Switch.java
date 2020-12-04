package String11_27_08;

public class Substring2solve_Switch {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		String s = jumin.substring(7, 8);
		System.out.print("추출한 숫자는 " + s + "이고");// Substring(n1,n2); n1 부터 n2-1까지추출
		switch (s) {
		case "1":
		case "3":
			System.out.println("남자 입니다.");
			break;
		case "2":
		case "4":
			System.out.println("여자 입니다.");
			break;
		default:
			System.out.println("외국인 입니다.");

		}

	}
}
