package Operator;

public class res_plus_minus {
	public static void main(String args[]) {
		int res=10, a=2;
		res += a; //res = res + a; 
		System.out.println(res);
		
		res -= a; //res = res - a; 
		System.out.println(res);
		
		res *= a; //res = res * a; 
		System.out.println(res);
		
		res /= a; //res = res / a; 
		System.out.println(res);
		
		int num = 29;
		num -= 2 + 3 * 4; //num = num - (2 + 3 * 4)�� ���� ȿ���� ���� ���Թ�
		System.out.println(num);
			
	}
}
