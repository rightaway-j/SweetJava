package conditional_loop;

public class Test_for02 {
	public static void main(String args[]) {
			int dan = 2, i;
		
			System.out.println("[" + dan + "단}");
			for( i =1 ; i <=9; i++ ) {
			System.out.println(dan + "*" + i + "=" + dan * i);
			}
			
			dan = 3;
			
			System.out.println("[" + dan + "단}");
			for( i =1 ; i <=9; i++ ) {
			System.out.println(dan + "*" + i + "=" + dan * i);
			}
			 dan = 4;
			
			System.out.println("[" + dan + "단}");
			for( i =1 ; i <=9; i++ ) {
			System.out.println(dan + "*" + i + "=" + dan * i);
			}
			dan = 5;
			
			System.out.println("[" + dan + "단}");
			for( i =1 ; i <=9; i++ ) {
			System.out.println(dan + "*" + i + "=" + dan * i);
			}
		  
			System.out.println("[" + dan + "단}");
			for( i =1 ; i <=9; i++ ) {
			System.out.println(dan + "*" + i + "=" + dan * i);
			}
//반복문 사용하여 for 안에 for넣기
			for (int dan1 = 2; dan1 <= 9; dan1 ++) {
				System.out.println("[" + dan1 + "단]");
			
//			for( i =1 ; i <=9; i++ ) {
//				System.out.println(dan1 + "*" + i + "=" + dan1 * i);
//			}
			}
	}
	}
