package conditional_loop;
import java.util.Scanner;
public class Test_for03 {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("���ϴ� ���� �Է��ϼ���>");
	 int n = sc.nextInt();
	 int i;
	 System.out.println("[" + n + "��}");
		for( i =1 ; i <=9; i++ ) {
		System.out.println(n + "*" + i + "=" + n * i);
		}
		sc.close();
 }
}
