package Wrapper12_01_07;
/*
 * Integer��ü�� �̿��� String => int ��� �� ����
 * 
 * ���1.
 * String => Integer ��ü
 * Integr ��ü => int�� ��
 * 
 * ���2. 
 * String =>int
 * Ex) Integer.parseInt(args[cnt])
 */

Integer.parseInt(args[0])

//��� 2.
public class String_to_int3 {
	public static void main(String args[]) {
		int total = 0;
		
		for (int cnt =0; cnt < args.length; cnt++) {
			total += Integer.parseInt(args[cnt]);
			
		}
		System.out.println("��="+total);
	}
}
