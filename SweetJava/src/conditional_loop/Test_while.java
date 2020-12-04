package conditional_loop;

public class Test_while {
	public static void main(String args[]) {
		int cnt = 1;
		while (cnt < 11) {
			System.out.println(cnt);
			cnt = cnt + 2;

		}
		int cnt1 = 2;
		while (cnt1 <= 10) {
			System.out.println(cnt1);
			cnt1 = cnt1 + 2;
		}
		
		//sum 의 초기값 지정 필수
		
		int sum = 0;
		int i = 1;
		while( i <=10 ) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);
		System.out.println("=====================");
		int sum1 = 1;
		int i1 = 3 ;
		while( i1 <=10) {
			sum1 = sum1 + i1;
			i1 = i1 + 2;
		}
		System.out.println(sum1);
		System.out.println("=======짝수의 합==============");
		int sum2 = 0;
		int i2 = 2;
		while( i2 <=11) {
			sum2 = sum2 + i2;
			i2 = i2 + 2;
			System.out.println(sum2);
		}
		System.out.println("=====================");
		int sum3 = 0;
		int i3 = 2;
	
		while( i3++ <=10) {
			sum3 = sum3 + i3;
			System.out.println(i3);
		}
	}
	
}
