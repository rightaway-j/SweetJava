package conditional_loop;
import java.io.InputStream;
import java.util.Scanner;
public class And_or {
	public static void main(String args[]) {
		InputStream in = System.in;
		Scanner sc = new Scanner (in);
		int num;
		
		System.out.println("���� �Է��ϼ���>");
		num = sc.nextInt();
		
		if (num>=1 && num<=10) {
			System.out.println("1~10������ �� �Դϴ�.");
		}else {
			System.out.println("1~10������ ���� �ƴմϴ�.");
		}
	sc.close();
	}

}
