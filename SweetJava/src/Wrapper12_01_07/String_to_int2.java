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


//���1. 
public class String_to_int2 {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt =0;cnt < args.length; cnt++) {
			System.out.println("args[" + cnt + "]=" + args[cnt]);
			
			//���ڷ� ���� ���ڿ��� ������ Integer��ü�� ����
			Integer obj = new Integer(args[cnt]); //Integer�� ���ڰ����� �־
			
			//Integer ��ü �ȿ� �ִ� int���� �����ɴϴ�.
			total += obj.intValue();
			
		}
		System.out.println("��=" + total);
	}
}
