package StringTokenizer;
//���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�

import java.util.StringTokenizer;

public class Ex {
	public static void main(String args[]) {
		//��ȹ����=�޸���(,)�� ������(|)
		StringTokenizer stok = new StringTokenizer("���,��|������", ",|");
		
		while(stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
