package Wrapper12_01_07;

public class String_to_int {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt =0; cnt < args.length; cnt++) {
			//에러발생 (String => int  형변환 요구)
			total = args[cnt]+ total; //형이 안맞기 때문에
			
		}
		System.out.println(total);
	}
}
