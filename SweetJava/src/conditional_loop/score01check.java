package conditional_loop;
import java.util.Scanner;
//public class score01 {
//	public static void main(String args []) {
//		System.out.println("점수를 입력하세요>");
//		Scanner sc = new Scanner(System.in);
//		int jumsu = sc.nextInt(); //s= 95;
//		if (jumsu >= 90 ) {
//			System.out.println("A학점");
//		}else if (jumsu >= 80 ) {
//			System.out.println("B학점");
//		}else if (jumsu >= 70 ) {
//			System.out.println("C학점");
//		}else if (jumsu >= 60 ) {
//			System.out.println("D학점");
//		}else if (jumsu >= 50) {
//			System.out.println("F학점");
//		}
//		
//		System.out.println("몫 = " + jumsu / 10);
//		System.out.println("끝.");
//		
//		sc.close();
//	}
//}
public class score01check{
	public static void main(String args []) {
		System.out.println("점수를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt(); //s= 95;
		int mok = jumsu/10;
		
		if (mok == 9  || mok == 10) {
			System.out.println("A학점");
		}else if (mok == 8 ) {
			System.out.println("B학점");
		}else if (mok  == 7 ) {
			System.out.println("C학점");
		}else if (mok  == 6 ) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
	
		System.out.println("끝.");
		
		sc.close();
	}
}