package conditional_loop;

public class Test_for01 {
	public static void main(String args[]) {
		for (int cnt = 1; cnt <= 10; cnt = cnt + 2) {
			System.out.println(cnt);
		}
		System.out.println("========1-10 ���� Ȧ��==================");
		for (int cnt = 2; cnt <= 10; cnt = cnt + 2) {
			System.out.println(cnt);
		}
		System.out.println("==========1- 10���� ¦�� ================");
		int sum = 0;
		
		 for (int cnt = 1;  cnt <= 10 ; cnt = cnt + 1) {
			 sum = sum + cnt;
		 }
		 System.out.println(sum);
		 System.out.println("=======������===================");
		 	int sum2 = 0;
			
			 for (int cnt = 1;  cnt <= 10 ; cnt = cnt + 2) {
				 sum2 = sum2+ cnt;
			 }
			  System.out.println(sum2);
		 System.out.println("=======Ȧ������===================");
		 	int sum1 = 0;
			
			 for (int cnt = 2;  cnt <= 10 ; cnt = cnt + 2) {
				 sum1 = sum1+ cnt;
			 }
			  System.out.println(sum1);
			  System.out.println("=======¦������===================");
			  System.out.println("=========�ٸ� ���==================");
			 int cnt1 = 0;
			 //�ʱ�İ� ������ ���� �����ϴ�.
			 for ( ; cnt1 <10 ;) {
				 System.out.println(cnt1);
				 cnt1++;
			 }
			 //�ʱ�İ� �����Ŀ� �ϳ� �̻��� ������ �� �� �ֽ��ϴ�. �޸��� �����մϴ�.
			  for(int a=1, b=5; a < b; a++, b--){
				 System.out.print("a = "+ a);
				 System.out.println(", b = "+ b); 
			 }
			  System.out.println("Done.");
	}
}



