package break_;

public class break02for_in_for {
public static void main(String args[]) {
	for (int row = 0; row <3; row++) {
		for (int col = 0; col <5; col++) { //여기서부터
			System.out.println("(" + row + "," + col + ")");
			if ((row == 1) && (col == 3))
				break; // break 를 내포하는 반복문 밖으로 제어가 이동한다
		}
		
	}//여기까지
	System.out.println("끝.");
}

}
