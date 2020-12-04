package String11_27_08;

public class StringEx {
	public static void main(String args[]) {
		String str = "집에 가고 싶어요.";
		int len = str.length();//length 메서드 호출
		
		for(int cnt = 0; cnt < len; cnt ++) {
			char ch = str.charAt(cnt); //charAt메서드 호출
			System.out.println("index =" + cnt + "문자 = " + ch);
		}
	}
}
