package String11_27_08;

public class StringEx {
	public static void main(String args[]) {
		String str = "���� ���� �;��.";
		int len = str.length();//length �޼��� ȣ��
		
		for(int cnt = 0; cnt < len; cnt ++) {
			char ch = str.charAt(cnt); //charAt�޼��� ȣ��
			System.out.println("index =" + cnt + "���� = " + ch);
		}
	}
}
