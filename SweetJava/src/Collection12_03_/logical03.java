package Collection12_03_;

public class logical03 {
	public static void main(String args[]) {
		System.out.println(!true);
		System.out.println(!false);
		
		int a=3, b=4;
		
		if(a >= b) {
			System.out.print(a + ">=");
		}
		if (!(a>=b)) {
			System.out.println(a + "<" + b);
		}
	}
}
