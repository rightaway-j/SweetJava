package HashMap12_03_03;

public class HashCode_overriding {
public static void main(String[]args) {
	String str1 = new String("abc"); //오버라이딩 된 String을 사용햇기때문
	String str2 = new String("abc");
	
	//String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 
	//hashCode메서드가 오버라이딩되어 있기 때문에
	//문자열의 내용이 같은str1과 str2에 대해 hashCode()를 호추랗면
	//항상 동일한 해시코드값을 얻는다.
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
}
}
