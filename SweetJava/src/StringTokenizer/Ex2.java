package StringTokenizer;
//���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�

import java.util.StringTokenizer;

public class Ex2 {
	public static void main(String args[]) {
		//true :������(��������)�� ��ū���� �����ϵ��� ����� ����
		StringTokenizer stok = new StringTokenizer("���=10|���ݷ�=3|������=1", "=|",true); 
		
		while(stok.hasMoreTokens()) {
			String token = stok.nextToken();
			System.out.println(token);
		}
	}
}
