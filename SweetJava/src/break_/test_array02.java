package break_;
import java.util.Scanner;
public class test_array02 {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���� 5���� �Է��ϼ���>");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		int n4 = sc.nextInt();
//	    int	n5 = sc.nextInt();
//		
//		int[] Score = {n1,n2,n3,n4,n5};
//		int sum = 0;
//		sum += score;
//		
		
		
		int sum=0;
		double avg= 0;
		int[] score = new int[5];
		
		System.out.println("���� 5���� �Է��ϼ���>");
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i <score.length;i ++) {
			score[i]= sc.nextInt();
			sum = sum + score[i];
			
		}
		
		avg=(double)sum/(score.length); // avg=(double)sum/5.0;
		System.out.println("��=" +sum + " \n ���" + avg);
		System.out.println("============================");
		System.out.printf("��=%5d\n���=%5.1f",sum, avg);
		sc.close();
		
	}
}
