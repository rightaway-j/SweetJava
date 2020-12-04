package conditional_loop;
import java.util.Scanner;
public class Test_for03 {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("원하는 단을 입력하세요>");
	 int n = sc.nextInt();
	 int i;
	 System.out.println("[" + n + "단}");
		for( i =1 ; i <=9; i++ ) {
		System.out.println(n + "*" + i + "=" + n * i);
		}
		sc.close();
 }
}
