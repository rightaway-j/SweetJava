package String11_27_08;

public class StringEx_sevral_things01 {
public static void main(String args[]) {
	String str1 = "   Let it be.   ";
	String str2 = str1.trim();
	System.out.println("===  trim() : 문자열 앞뒤 공백제거   ===");
	 System.out.println(str1);
	 System.out.println(str2);
	 System.out.println("문자열 길이 =" + str2.length() + "\n");
	 
	 System.out.println("===concat() : 문자열 연결 ===");
	 System.out.println(str2.concat(" Speaking words of wisdom"));
	 System.out.println(str2 + "\n");
	 
	 System.out.println("===toUpperCase() : 대문자로 변환 ===");
	 System.out.println(str2.toUpperCase());
	 System.out.println(str2 + "\n");

	 System.out.println("===toLowerCase() : 소문자로 변환 ===");
	 System.out.println(str2.toLowerCase());
	 System.out.println(str2 + "\n");
	 
	 System.out.println("===concat() : 새로운 글자로 모두변경 ===");
	 System.out.println(str2.replace('e','a'));
	 System.out.println(str2 + "\n");
	 
	 System.out.println("=============toString() ==========");
	 System.out.println(str1.toString());
	 System.out.println(str2.toString()+ "\n");
}
}


