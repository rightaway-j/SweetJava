package Collection12_03_;
import java.util.Scanner;
/*
 * 3���� ������ �Է��϶� 10 20 30
 * 10,20,30�� ū���� 30 �̴�.
 * 10,20,30�� �������� 10 �̴�.
 */
public class Test05solve {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("3���� ������ �Է� �ϼ���>");
		 int n1, n2, n3, max, min;
		 n1 = sc.nextInt();
		 n2 = sc.nextInt();
		 n3 = sc.nextInt();
		 
		 max = (n1 > n2) ? n1 : n2;
		 max = (max > n3) ? max : n3;
		 
		 min = (n1 < n2) ? n1 : n2;
		 min = (min < n3) ? min : n3;
		 
		 System.out.println(n1 + "," + n2 + "," + n3 + " �� ū����" + max + "�Դϴ�");
		 System.out.println(n1 + "," + n2 + "," + n3 + " �� ��������" + min + "�Դϴ�");
	sc.close();
	}
}