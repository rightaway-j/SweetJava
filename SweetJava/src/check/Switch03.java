package check;
import java.util.Scanner;
public class Switch03 {
 public static void main(String args []) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("����1�� �Է��ϼ���>");
	 int num1 = sc.nextInt();
	 System.out.println("���� 2�� �Է��ϼ���>");
	 int num2 = sc.nextInt();
	 System.out.println("�����ڸ� �Է��ϼ���>");
	 String s = sc.next();
	 
	 switch (s) {
	 
	 case "+": //��Ʈ���� ������Ʈ�� �����ֱ�
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
		 System.out.println("+,-,*,/,%�� �Ѱ��� �Է��ϼ���");
	 
	 }
	sc.close(); 
 }
 
}
