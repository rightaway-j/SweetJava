package Math_11_30;

//0이상 1미만의 난수 발생하는 프로그램 파일을 난수로 만들고 눈에 보이는 것은파일 이름 
public class Math_round_test_lotto_solve {
	public static void main(String args[]) {
		System.out.println(Math.random());// 0<=난수<1:double형
		System.out.println(Math.random());
		System.out.println(Math.random());
		int num;
		/*
		 * 0부터 9 까지의 정수 범위에 속하느 ㄴ난수를 만들기 1. 0<= 난수<1 2. 0<= 난수*10 <10 3.0<= (int)(난수*10)
		 * < 10==> 정수로 만들기
		 * 
		 */
		// 공식:(정수화)((상한값- 하한값+1)*난수+하한값)
		// (int)((9-0+1)*난수 +0)
		num = (int) (Math.random() * 10);
		System.out.println(num);

		for (int n = 0; n < 6; n++) {
			num = (int) ((45 - 1 + 1) * Math.random() + 1); // n으로 for문이 6번 돌꺼야 그 6번 도는 동안에 num 에대한 식이 6번 돌아
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("===========정렬 후 ===========");

		for (int i = 0; i < 6; i++) {
			num = (int) (Math.random() * 45 + 1);

			int[] a = {num};
			System.out.println(a[0]);
			
//		int[] a = { num };
//		for (int n = 0; n <= 5; n++) {
//			for (int s = 1; s <= 5; s++) {
//				if (a[n]==(a[s])) {
//					return;
//				}
//				else System.out.print(num + " ");
//			}
			}
		}
	}

