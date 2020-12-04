package conditional_loop;

public class Switch02_char {
	public static void main(String args[]) {
		String ch = "a"; // char''전체 사용 변경 가능

		switch (ch) {
		case "A":
		case "a":
			System.out.println("사과");
			break;

		case "P":
		case "p":
			System.out.println("배");
			break;

		case "G":
		case "g":
			System.out.println("포도");
			break;

		default:
			System.out.println("?");

		}
		System.out.println("끝");

	}
}
