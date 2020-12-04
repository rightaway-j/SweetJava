package break_;

public class break03outerLoop {
	public static void main(String args[]) {
	
	outerLoop:
	for (int row = 0; row <3; row++) {
		for (int col = 0; col <5; col++) { //여기서부터
			System.out.println("(" + row + "," + col + ")");
			if ((row == 1) && (col == 3))
				break; // outerLoop 블럭문을 벗어난다
		}
		
	}//여기까지
	System.out.println("Done.");

}
}
