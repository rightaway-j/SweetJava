package StringTokenizer;
//���ڿ��κ��� ��ū�� �и��ϴ� ���α׷�

import java.util.StringTokenizer;

public class Ex3_if_elseIf {
	public static void main(String args[]) {
		//true :�����ڵ� ��ū���� �����ϵ��� ����� ����
		StringTokenizer stok = new StringTokenizer("���=10|���ݷ�=3|������=1", "=|",true);
		
		System.out.println("��ǰ�̸�\t��ǰ��");
		while(stok.hasMoreTokens()) {
			String token = stok.nextToken();//(���� ������ ��ū���� if,elseif�� �ɷ��ٰž�)
			if(token.equals("=")) {
				System.out.print("\t");//����� �Ǵ� escape����
			}
			
			else if(token.equals("|")) {//���� if�� �������� ������ �Ʒ� else if�� �����ض� 
				System.out.print("\n");
			}
			else {System.out.print(token); //���� �ɷ����� �����͸� ����ض�, ���������� else�� ���
			}
			
		}
	}
}
