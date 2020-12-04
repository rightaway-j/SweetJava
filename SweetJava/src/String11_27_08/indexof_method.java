package String11_27_08;

public class indexof_method {
	public static void main(String args[]) {
		String message = "Java program creates many objects.";
		

		// 지정된 문자가 최초로 위치한 인덱스를 구한다.
		// 존재하지 않는 경우 -1을 리턴한다.
		// 문자열 앞에서 부터 차례대로 검색한다
		
		int index1 = message.lastIndexOf('a');
		System.out.println("a의 위치는" + index1);

		// 아스키코드 97은 소문자'A'
		int index2 = message.lastIndexOf(97);
		System.out.println("A의 위치는" + index2);

		// index번호 13번째부터 'a'를 찾습니다.
		int index3 = message.lastIndexOf('a', 13);
		System.out.println("13번부터 a의 위치는" + index3);
		
		// index번호 13번째부터 'a'를 찾습니다.
		int index33 = message.lastIndexOf('a', 13);
		System.out.println("13번부터 a의 위치는" + index33);
		
		int index4 = message.lastIndexOf("av");
		System.out.println("av로 시작하는 index는" + index4);
		
		int index5 = message.lastIndexOf("man", 12);
		System.out.println("12번째부터 man위치는" + index5);
		
		
		int index6 = message.lastIndexOf("java");
		System.out.println("java의위치는" + index6);
	}
}
