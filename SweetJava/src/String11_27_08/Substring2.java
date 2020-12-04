package String11_27_08;

public class Substring2 {
	public static void main() {
		String jumin = "123456-4123456";
		if (jumin.substring(7).equals("1")) {

			System.out.println("추출한 숫자는 " + "1" + "여자 입니다.");

		} else if (jumin.substring(7).equals("3")) {
			System.out.println("추출한 숫자는 " + "3" + "남자 입니다.");
		} else if (jumin.substring(7).equals("2")) {
			System.out.println("추출한 숫자는 " + "2" + "여자 입니다.");
		} else if (jumin.substring(7).equals("4")) {
			System.out.println("추출한 숫자는 " + "4" + "여자 입니다.");
		}else{
			System.out.println("추출한 숫자는  입니다.");
		}

	}
}
