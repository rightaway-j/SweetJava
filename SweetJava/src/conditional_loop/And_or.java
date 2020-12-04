package conditional_loop;
import java.io.InputStream;
import java.util.Scanner;
public class And_or {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner (in);
		int num;
		
		System.out.println("수를 입력하세요>");
		num = sc.nextInt();
		
		if (num>=1 && num<=10) {
			System.out.println("1~10사이의 수 입니다.");
		}else {
			System.out.println("1~10사이의 수가 아닙니다.");
		}
	sc.close();
	}

}
