package String11_27_08;
/*
 * substring(int beginIndex): beginIndex���� ���ڿ� ������ �κ� ���ڿ� ����
 * 2. substring(int beginIndex, int endIndex):
 * 								beginIndex ��ó endIndex-1���� �κ� ���ڿ� ����
 * 
 */

public class substring {
	public static void main(String args[]) {
		String str = "���� ����ϴ� �ڹ�";
				for (int cnt =0; cnt <str.length(); cnt ++) {
					char ch = str.charAt(cnt);//charAt �޼��� ȣǮ
					System.out.println("index = " + cnt + "����=" + ch);
					
				}
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,6));
	}

}
