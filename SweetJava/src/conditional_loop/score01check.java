package conditional_loop;
import java.util.Scanner;
//public class score01 {
//	public static void main(String args []) {
//		System.out.println("������ �Է��ϼ���>");
//		Scanner sc = new Scanner(System.in);
//		int jumsu = sc.nextInt(); //s= 95;
//		if (jumsu >= 90 ) {
//			System.out.println("A����");
//		}else if (jumsu >= 80 ) {
//			System.out.println("B����");
//		}else if (jumsu >= 70 ) {
//			System.out.println("C����");
//		}else if (jumsu >= 60 ) {
//			System.out.println("D����");
//		}else if (jumsu >= 50) {
//			System.out.println("F����");
//		}
//		
//		System.out.println("�� = " + jumsu / 10);
//		System.out.println("��.");
//		
//		sc.close();
//	}
//}
public class score01check{
	public static void main(String args []) {
		System.out.println("������ �Է��ϼ���>");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt(); //s= 95;
		int mok = jumsu/10;
		
		if (mok == 9  || mok == 10) {
			System.out.println("A����");
		}else if (mok == 8 ) {
			System.out.println("B����");
		}else if (mok  == 7 ) {
			System.out.println("C����");
		}else if (mok  == 6 ) {
			System.out.println("D����");
		}else {
			System.out.println("F����");
		}
		
	
		System.out.println("��.");
		
		sc.close();
	}
}