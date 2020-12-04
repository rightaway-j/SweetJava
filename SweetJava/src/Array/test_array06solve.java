package Array;
//     국어 수학 영어 총점 평균
//강호동
//이승기
//유재석
//하하
//이광수
public class test_array06solve {
	public static void main(String args[]) {
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", " 수학", "영어" };
		int[][] score = { { 85, 60, 70, }, // 0행 (1번학생)
				{ 90, 95, 80 }, // 1행 (2번학생)
				{ 75, 80, 100 }, // 2행 (3번학생)
				{ 80, 70, 95 }, // 3행 (4번학생)
				{ 100, 65, 80 }// 4행 (5번학생)
		};
		int korTotal = 0, engTotal = 0, mathTotal = 0;
//		int[] subject = new int[3];
//		int[] student = new int[5];
	
		System.out.println("=============학생별/과목별 총점 구하기===========");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
//		for(int i =0; i< sub_name.length; i++) {
//		System.out.print(sub_name[i]);
//		}
//		System.out.println();
		for (int r = 0; r <= score.length; r++) {
			int sum = 0;
			float avg = 0.0f;
				
			korTotal += score[r][0];
			engTotal += score[r][1];
			mathTotal += score[r][2];
			System.out.printf("%3d", r + 1);
			
			for (int i = 0; i<score[i].length; i++) {
				sum += score[r][i];
				System.out.printf("%5d", score[r][i]);
				
		}
			avg = sum/(float)score[r].length;
			System.out.printf("%5d %5.1f%n",sum, avg);
		}
		System.out.println("======================================");
		System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal,mathTotal);

//		for(int n=0 ; n<=2 ; n++ ) {
//			student [0] += score [0][n];
//			student[1] += score [1][n];
//			student[2] += score [2][n];
//			student[3] += score [3][n];
//			student[4] += score [4][n];
//		}
//		for(int i=0; i<sub_name.length; i++) {
//			System.out.print(sub_name[i]);

//				System.out.println();
//		}
//		for (int n = 0; n <= 2; n++) {
//			for (int n1 = 0; n1 <= 4; n1++) {
//				student[n1] += score[n1][n];
//			}
//		}
//		System.out.println(name[0] + "의 총점=" + student[0]);
//		System.out.println(name[1] + "의 총점=" + student[1]);
//		System.out.println(name[2] + "의 총점=" + student[2]);

//		for (int s = 0; s <= 4; s++) {
//			System.out.print(name[s] + "총점=" + student[s] + " ");
		
//			System.out.println("평균=" + student[s] / 3);

	}
}
