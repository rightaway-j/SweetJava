package conditional_loop;

public class Test_for_calander {
	public static void main(String[] args) {
		int day;
		for(day = 1; day <= 7; day++) {
			System.out.print("  " + day); 
		}
		System.out.println(" ");
		for(day = 8; day <= 14; day++) {
			System.out.print(" " + day); 
		}
		System.out.println(" ");
		for(day =15; day <= 21; day++) {
			System.out.print(" " + day); 
		}
		System.out.println(" ");
		for(day =22; day <= 28; day++) {
			System.out.print(" " + day); 
		}
		System.out.println(" ");
		for(day =29; day <= 31; day++) {
			System.out.print(" " + day); 
		}
		System.out.println(" ");
	}
}
