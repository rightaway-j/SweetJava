package String11_27_08;
import java.util.StringTokenizer;
public class SrtingTokenixerEx {
	public static void main(String args[]) {
		StringTokenizer stok = new StringTokenizer("��� �� ������");
		
//		String s1 = stok.nextToken();
//		System.out.println(s1);
//		
//		String s2 = stok.nextToken();
//		System.out.println(s2);
//		
//		String s3 = stok.nextToken();
//		System.out.println(s3);
//		
//		//��Ÿ�� ���� �߻� = ������ ��ū�� ���̻� ����
//		String s4 = stok.nextToken();
//		System.out.println(s4);
		while(stok.hasMoreTokens()) {
			System.out.println(stok.nextToken());
		}
		
		
	}

}
