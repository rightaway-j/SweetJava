package Math_11_30;

public class Math_roundEx {
public static void main(String args[]) {
	System.out.println("12.45 �ݿø�?" +  Math.round(12.45));
	System.out.println("124.5�ݿø�?"+ Math.round(124.5));
	
	//12.45�� �ݿø��ؼ� 12.5�� ����� ������.
	System.out.println("12.45 �ݿø�?"+Math.round(12.45*10)/10.0);
}
}
