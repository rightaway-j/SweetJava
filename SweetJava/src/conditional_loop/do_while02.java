//package conditional_loop;
//import java.util.Scanner;
//public class do_while02 {
//	public static void main(String args[]) {
//		String location;
//		Scanner sc = new Scanner(System.in);
//		
//			System.out.println("���� �Է�(eixt = q)>" + location);
//				location = sc.toString();
//			
//			do {
//				System.out.println("�Է��Ͻ� ������ " + location + "�Դϴ�." );
//			}
//			
//		while (location = "q") {
//		System.out.println("��.");
//		}	
//	}
//}==========================================
//package conditional_loop;
//
//import java.util.Scanner;
//
//public class do_while02 {
//	public static void main(String args[]) {
//		String location ;
//		Scanner sc = new Scanner(System.in);
//			System.out.println("���� �Է�(eixt = q)>" + location);
//			String name = sc.toString();
//				location = sc.toString();
//			
//			do {
//				System.out.println("�Է��Ͻ� ������ " + location + "�Դϴ�." );
//			}
//			while (name.equals ("q")) {
//		System.out.println("��.");	
//			sc.close();
//			}
//	}
//}
//==========================================
package conditional_loop;

import java.util.Scanner;

public class do_while02 {
	public static void main(String args[]) {
		String location ;
		Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("���� �Է�(eixt = q)>");
				location = sc.next();
					if(location.equals("q")) {
					break;
			}
			System.out.println("�Է��Ͻ� ������ " + location + "�Դϴ�." );
	}while (true) ;
			
		System.out.println("��.");	
			sc.close();
			}
	}

