package Wrapper12_01_07;

public class String_to_int {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt =0; cnt < args.length; cnt++) {
			//�����߻� (String => int  ����ȯ �䱸)
			total = args[cnt]+ total; //���� �ȸ±� ������
			
		}
		System.out.println(total);
	}
}
