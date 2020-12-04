package check;

public class Test_for_calander {
	public static void main(String[] args) {
		int day, dan1, n = 1;

		for (day = 1; day <= 7; day++) {
			System.out.print("  " + day);
		}
		System.out.println("");
		for (day = 8; day <= 14; day++) {
			System.out.print(" " + day);
		}
		System.out.println(" ");
		for (day = 15; day <= 21; day++) {
			System.out.print(" " + day);
		}
		System.out.println(" ");
		for (day = 22; day <= 28; day++) {
			System.out.print(" " + day);
		}
		System.out.println(" ");
		for (day = 29; day <= 31; day++) {
			System.out.print(" " + day);
		}
		System.out.println(" ");
		System.out.println("==================================================");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print("[" + dan1 + "´Ü}    ");
		}
		System.out.print("\n");

		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n) + "=" + (dan1 * n) + "   ");
		}System.out.print("\n");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n + 1) + "=" + (dan1 * (n+1)) + "   ");
		}System.out.print("\n");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n + 2) + "=" + (dan1 * (n+2)) + "   ");
		}System.out.print("\n");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n + 3) + "=" + (dan1 * (n+3)) + "   ");
		}System.out.print("\n");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n + 4) + "=" + (dan1 * (n+4)) + "   ");
		}System.out.print("\n");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n + 5) + "=" + (dan1 * (n+5)) + "   ");
		}System.out.print("\n");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n + 6) + "=" + (dan1 * (n+6)) + "   ");
		}System.out.print("\n");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n + 7) + "=" + (dan1 * (n+7)) + "   ");
		}System.out.print("\n");
		for (dan1 = 2; dan1 <= 9; dan1++) {
			System.out.print(dan1 + "*" + (n + 8) + "=" + (dan1 * (n+8)) + "   ");
		}System.out.print("\n");

	}
}
