package Wrapper12_01_07;

public class integer_to_hexString {
	public static void main(String args[]) {
		int num = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			//���ڷ� ���� ���ڿ��� intŸ���� ������ �ٲپ �ջ��մϴ�.
			num += Integer.parseInt(args[cnt]);
		}
		System.out.println("����=" + num);
		System.out.println("10����:"+ num + "\t2���� :"+ Integer.toBinaryString(num));
		System.out.println("10����:"+ num + "\t8���� :"+ Integer.toOctalString(num));
		System.out.println("10����:"+ num + "\t16���� :"+ Integer.toHexString(num));
		
	}
}
