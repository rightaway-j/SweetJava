package Math_11_30;

import java.util.*;//Random  클래스는 java.util 패키지에 속함

class randomEx {
	public static void main(String args[]) {
		Random random = new Random();// 파라미터 없는 생성자

		// 0부터 100미만의 정수형 난수 발생 -즉 , 0부터 99 까지의 정수형 난수 발생
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));

		// 1부터 45까지의 난수 발생
		System.out.println("1~45까지의 난수 발생 :" + (random.nextInt(45) + 1));

		/*
		 * 0 <= random.nextInt(45) <=44 1<= random.nextInt(45) +1 <= 45
		 * 
		 */
		// 9 45 1 26 18 38
		for (int i = 0; i < 6; i++) {
			System.out.print((random.nextInt(45) + 1) + "\t");
		}
	}

}
