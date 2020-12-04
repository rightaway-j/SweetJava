package conditional_loop;

public class Test_for01 {
	public static void main(String args[]) {
		for (int cnt = 1; cnt <= 10; cnt = cnt + 2) {
			System.out.println(cnt);
		}
		System.out.println("========1-10 까지 홀수==================");
		for (int cnt = 2; cnt <= 10; cnt = cnt + 2) {
			System.out.println(cnt);
		}
		System.out.println("==========1- 10까지 짝수 ================");
		int sum = 0;
		
		 for (int cnt = 1;  cnt <= 10 ; cnt = cnt + 1) {
			 sum = sum + cnt;
		 }
		 System.out.println(sum);
		 System.out.println("=======수의합===================");
		 	int sum2 = 0;
			
			 for (int cnt = 1;  cnt <= 10 ; cnt = cnt + 2) {
				 sum2 = sum2+ cnt;
			 }
			  System.out.println(sum2);
		 System.out.println("=======홀수의합===================");
		 	int sum1 = 0;
			
			 for (int cnt = 2;  cnt <= 10 ; cnt = cnt + 2) {
				 sum1 = sum1+ cnt;
			 }
			  System.out.println(sum1);
			  System.out.println("=======짝수의합===================");
			  System.out.println("=========다른 방법==================");
			 int cnt1 = 0;
			 //초기식과 증감식 생략 가능하다.
			 for ( ; cnt1 <10 ;) {
				 System.out.println(cnt1);
				 cnt1++;
			 }
			 //초기식과 증감식에 하나 이상의 문장이 올 수 있습니다. 콤마로 구분합니다.
			  for(int a=1, b=5; a < b; a++, b--){
				 System.out.print("a = "+ a);
				 System.out.println(", b = "+ b); 
			 }
			  System.out.println("Done.");
	}
}



