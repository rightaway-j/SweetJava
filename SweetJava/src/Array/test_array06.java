package Array;
//     국어 수학 영어 총점 평균
//강호동
//이승기
//유재석
//하하
//이광수
public class test_array06 {
	public static void main(String args[]) {
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", " 수학", "영어" };
		int[][] score = { { 85, 60, 70, }, // 0행 (1번학생)
				{ 90, 95, 80 }, // 1행 (2번학생)
				{ 75, 80, 100 }, // 2행 (3번학생)
				{ 80, 70, 95 }, // 3행 (4번학생)
				{ 100, 65, 80 }// 4행 (5번학생)
		};
		int[] subject = new int[3];
		int[] student = new int[5];
		int r, c;
		System.out.println("=======학생별/과목별 총점 구하기====");
		
		for (r = 0; r <= 4; r++) {

		}

//		for(int n=0 ; n<=2 ; n++ ) {
//			student [0] += score [0][n];
//			student[1] += score [1][n];
//			student[2] += score [2][n];
//			student[3] += score [3][n];
//			student[4] += score [4][n];
//		}
		for(int i=0; i<sub_name.length; i++) {
			System.out.print(sub_name[i]);

				System.out.println();
		}
		for (int n = 0; n <= 2; n++) {
			for (int n1 = 0; n1 <= 4; n1++) {
				student[n1] += score[n1][n];
			}
		}
//		System.out.println(name[0] + "의 총점=" + student[0]);
//		System.out.println(name[1] + "의 총점=" + student[1]);
//		System.out.println(name[2] + "의 총점=" + student[2]);

		for (int s = 0; s <= 4; s++) {
			System.out.print(name[s] + "총점=" + student[s] + " ");
			//for (r = 0; r< 5; r++)
			//subject[0] += score[r][0]; (국어 총점)
			
			for(r=0; r<5; r++) {
				System.out.println("\n" + name[r]+"\t");
				for(c = 0; c<3; c++);
				student[r] += score[r][c];
				student[c] += score[r][c];
			}
			
			System.out.println("평균=" + student[s] / 3);
			
			System.out.println();
			for(int i=0; i<45; i ++)
				System.out.print("=");
			
			System.out.print("\n"+"총점"+"\t");
			for(c=0;c<3;c++)
			System.out.print(subject[c]+"\t");
		}

	}
}
