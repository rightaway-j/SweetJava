//package conditional_loop;
//import java.util.Scanner;
//public class do_while02 {
//	public static void main(String args[]) {
//		String location;
//		Scanner sc = new Scanner(System.in);
//		
//			System.out.println("지역 입력(eixt = q)>" + location);
//				location = sc.toString();
//			
//			do {
//				System.out.println("입력하신 지역은 " + location + "입니다." );
//			}
//			
//		while (location = "q") {
//		System.out.println("끝.");
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
//			System.out.println("지역 입력(eixt = q)>" + location);
//			String name = sc.toString();
//				location = sc.toString();
//			
//			do {
//				System.out.println("입력하신 지역은 " + location + "입니다." );
//			}
//			while (name.equals ("q")) {
//		System.out.println("끝.");	
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
				System.out.println("지역 입력(eixt = q)>");
				location = sc.next();
					if(location.equals("q")) {
					break;
			}
			System.out.println("입력하신 지역은 " + location + "입니다." );
	}while (true) ;
			
		System.out.println("끝.");	
			sc.close();
			}
	}

