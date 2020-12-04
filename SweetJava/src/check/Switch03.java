package check;
import java.util.Scanner;
public class Switch03 {
 public static void main(String args []) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("정수1를 입력하세요>");
	 int num1 = sc.nextInt();
	 System.out.println("정수 2를 입력하세요>");
	 int num2 = sc.nextInt();
	 System.out.println("연산자를 입력하세요>");
	 String s = sc.next();
	 
	 switch (s) {
	 
	 case "+": //스트링은 더블코트로 감싸주기
	  System.out.println(num1 + s + num2 + "=" + (num1 + num2));
	  break;
	 case "-":
		  System.out.println(num1 + s + num2 + "=" + (num1 + num2));
		  
		  break;
	 case "*":
		  System.out.println(num1 + s + num2 + "=" + (num1 + num2));
		  break;
	 case "/" :
		  System.out.printf("%d %s %d = %.1f\n",num1, s , num2,
				  						(double)num1/ num2 );
		  break;
	 case "%":
		  System.out.println(num1 + s + num2 + "=" + num1%num2);
		  break;
	 default :
		 System.out.println("+,-,*,/,%중 한개를 입력하세요");
	 
	 }
	sc.close(); 
 }
 
}
