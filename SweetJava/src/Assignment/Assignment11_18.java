package Assignment;

import java.util.Scanner;

public class Assignment11_18 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int page, limit;
	
	System.out.print("limit�� �Է��ϼ���:");
	limit = sc.nextInt();
	System.out.print("listcount�� �Է��ϼ���:");
	page = sc.nextInt();
	
	int num2 = (page-1) / limit + 1 ;

	if (num2 == 0) {
		System.out.println("��°�=" + 1);
	}
	else {
			System.out.println( "maxpage" + "="+ num2 );
			
	}
	 
	sc.close();
	}
}
