package Math_11_30;

public class Math_roundEx {
public static void main(String args[]) {
	System.out.println("12.45 반올림?" +  Math.round(12.45));
	System.out.println("124.5반올림?"+ Math.round(124.5));
	
	//12.45를 반올림해서 12.5로 만들어 보세요.
	System.out.println("12.45 반올림?"+Math.round(12.45*10)/10.0);
}
}
