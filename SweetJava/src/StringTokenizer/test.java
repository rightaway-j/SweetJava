//StringTokenizer�� ���
//StringTokenizer�� ��ɰ� ������ String�� split�޼ҵ� ����
/*
 * StringTokenizer:010-1234-5678 ��ū �и�
 * 010
 * 12
 * 5678
 * 
 * Stirng�� split�޼ҵ� �̿� 
 * 010
 * 1234
 * 5678
 */
package StringTokenizer;

import java.util.StringTokenizer;

public class test {

	public static void main(String args[]) {
		String phone = "010-1234-5678";
		StringTokenizer str = new StringTokenizer(phone, "-"); //�ι� ����Ұű⿡ ������ ���� -��ȣ�� �ٲٰ������ ������ �����(���ͷ��� �״�� ���� ���ŷο�)
		System.out.println("***StringTokenizer:" + phone + "��ū �и� ***");

		while (str.hasMoreTokens()) { //��� �ִ��� �𸣴� �ִ°� true false�� �� �����Ͷ�
			System.out.println(str.nextToken()); //���������� ��Ʈ�� �迭 ����ϰ� ���� (����� �𸣴�)
			}
		System.out.println("***String�� split �޼��� �̿�:" + phone + "��ū �и� ***");
			//�迭�� ������ �������϶� length �Ӽ��� ���
		String[]st = phone.split("-"); //�ڷ����� ��Ʈ���̾ ��Ʈ�� �迭 ��� //��ȯ����Sring[] Ȯ���ϰ� �־��ֱ�
		//String �� split�̶�� �޼��带 ����ؼ� �迭,���� �ϼ�
			for(int i = 0; i <st.length; i++) //��Ʈ�� Ŭ������ length�� ���ڿ��� ����, ���� ������ �ʿ� ����
				System.out.println(st[i]);
			System.out.println("========���� for��=======");
			for(String token:st) {
				System.out.println(token);
			}

	}
}
