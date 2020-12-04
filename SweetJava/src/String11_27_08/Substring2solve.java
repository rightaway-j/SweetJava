package String11_27_08;

public class Substring2solve {
	public static void main(String args[]) {
		String jumin = "123456-4123456";
		String s = jumin.substring(7, 8);
		System.out.print("추출한 숫자는 " + s + "이고");// Substring(n1,n2); n1 부터 n2-1까지추출

		if (s.equals("1") || s.equals("3")) {
			System.out.println("남자 입니다.");
		} else if (s.equals("2") || s.equals("4")) {
			System.out.println("여자 입니다.");
		} else {
			System.out.println("외국인 입니다.");
		}
	}
}
