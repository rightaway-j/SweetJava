package Array;
//     ���� ���� ���� ���� ���
//��ȣ��
//�̽±�
//���缮
//����
//�̱���
public class test_array06solve {
	public static void main(String args[]) {
		String name[] = { "��ȣ��", "�̽±�", "���缮", "����", "�̱���" };
		String sub_name[] = { "����", " ����", "����" };
		int[][] score = { { 85, 60, 70, }, // 0�� (1���л�)
				{ 90, 95, 80 }, // 1�� (2���л�)
				{ 75, 80, 100 }, // 2�� (3���л�)
				{ 80, 70, 95 }, // 3�� (4���л�)
				{ 100, 65, 80 }// 4�� (5���л�)
		};
		int korTotal = 0, engTotal = 0, mathTotal = 0;
//		int[] subject = new int[3];
//		int[] student = new int[5];
	
		System.out.println("=============�л���/���� ���� ���ϱ�===========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
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
		System.out.printf("����:%3d %4d %4d%n", korTotal, engTotal,mathTotal);

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
//		System.out.println(name[0] + "�� ����=" + student[0]);
//		System.out.println(name[1] + "�� ����=" + student[1]);
//		System.out.println(name[2] + "�� ����=" + student[2]);

//		for (int s = 0; s <= 4; s++) {
//			System.out.print(name[s] + "����=" + student[s] + " ");
		
//			System.out.println("���=" + student[s] / 3);

	}
}
