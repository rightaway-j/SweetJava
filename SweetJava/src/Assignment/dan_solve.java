package Assignment;

public class dan_solve { //각 출력의 기본은 열이 아닌 행으로 이루어져 있기에 가로로 생각을해서 반복문을 돌려줘야함
	public static void main(String args[]) {
		for (int dan = 2; dan <=9; dan++)
			//타이틀 출력
			System.out.print("[" + dan + "단" + "\t");// 글꼴로 인한 약간의 위치 차이 있을 수 있다. \t로 8칸 띄어서 출력
		System.out.println();
		//각단의 
		for (int dan =2; dan <= 9; dan ++) {
			System.out.print(dan + "*" + 1 + "=" + 1 * dan + "\t"); //for문안에 for문으로 넣고 변수를 지정해서 처리
		}
		
		System.out.println();//변하는건 변수에 고정은 문자열에
		 //모든 단 한 줄씩 출력
		for (int i = 1; i <=9; i++) {
			System.out.println();
			for (int dan = 2; dan <=9; dan ++) {
				System.out.print(dan + "*" + i + "=" + i*dan + "\t ");
			}//dan end
		}// i end
	}//main end
}//class end
