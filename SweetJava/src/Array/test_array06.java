package Array;
//     ���� ���� ���� ���� ���
//��ȣ��
//�̽±�
//���缮
//����
//�̱���
public class test_array06 {
	public static void main(String args[]) {
		String name[] = { "��ȣ��", "�̽±�", "���缮", "����", "�̱���" };
		String sub_name[] = { "����", " ����", "����" };
		int[][] score = { { 85, 60, 70, }, // 0�� (1���л�)
				{ 90, 95, 80 }, // 1�� (2���л�)
				{ 75, 80, 100 }, // 2�� (3���л�)
				{ 80, 70, 95 }, // 3�� (4���л�)
				{ 100, 65, 80 }// 4�� (5���л�)
		};
		int[] subject = new int[3];
		int[] student = new int[5];
		int r, c;
		System.out.println("=======�л���/���� ���� ���ϱ�====");
		
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
//		System.out.println(name[0] + "�� ����=" + student[0]);
//		System.out.println(name[1] + "�� ����=" + student[1]);
//		System.out.println(name[2] + "�� ����=" + student[2]);

		for (int s = 0; s <= 4; s++) {
			System.out.print(name[s] + "����=" + student[s] + " ");
			//for (r = 0; r< 5; r++)
			//subject[0] += score[r][0]; (���� ����)
			
			for(r=0; r<5; r++) {
				System.out.println("\n" + name[r]+"\t");
				for(c = 0; c<3; c++);
				student[r] += score[r][c];
				student[c] += score[r][c];
			}
			
			System.out.println("���=" + student[s] / 3);
			
			System.out.println();
			for(int i=0; i<45; i ++)
				System.out.print("=");
			
			System.out.print("\n"+"����"+"\t");
			for(c=0;c<3;c++)
			System.out.print(subject[c]+"\t");
		}

	}
}
