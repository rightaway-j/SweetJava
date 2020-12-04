package Collection12_03_;
import java.util.Scanner;
/*
 * 3개의 정수를 입력하라 10 20 30
 * 10,20,30중 큰수는 30 이다.
 * 10,20,30중 작은수는 10 이다.
 */
public class Test05solve {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("3개의 정수를 입력 하세요>");
		 int n1, n2, n3, max, min;
		 n1 = sc.nextInt();
		 n2 = sc.nextInt();
		 n3 = sc.nextInt();
		 
		 max = (n1 > n2) ? n1 : n2;
		 max = (max > n3) ? max : n3;
		 
		 min = (n1 < n2) ? n1 : n2;
		 min = (min < n3) ? min : n3;
		 
		 System.out.println(n1 + "," + n2 + "," + n3 + " 중 큰수는" + max + "입니다");
		 System.out.println(n1 + "," + n2 + "," + n3 + " 중 작은수는" + min + "입니다");
	sc.close();
	}
}