package Operator;

public class Oper01_0 {
	public static void main(String args[]) {
		//������(int) ���� a,b,c�� �����մϴ�.
		
		//a=10, b= 4�� �ʱ�ȭ �մϴ�.
		int a = 10, b = 4, c;
		
		c = a + b;   
		System.out.println(a + "+" + b + "=" + c);
		c = a - b;   
		System.out.println(a + "-" + b + "=" + c);
		c = a * b;   
		System.out.println(a + "*" + b + "=" + c);
		c = a / b;   
		System.out.println(a + "/" + b + "=" + c);
		c = a % b;   //�ϸ���
		System.out.println(a + "%" + b + "=" + c);
		System.out.printf("%d %% %d = %d\n",a,b,c);
		int e= 10, f=5;
		int d = e % f;
		System.out.printf("%d %% %d = %d%n",e,f,d);
		//(double) (a/b)
		//(double)a
		//(double)a/b
		//a/(double)b
		//(double)a/(double)b
		//c = a / b
		double g = (double)a/b;
		System.out.println(a + "/" + b + "=" + g);
//		 float g = (float)a/b;
		System.out.printf("%d / %d = %f\n",a,b,g);
		System.out.printf("%d / %d = %f\n",a,b,g);
				
	}

}
