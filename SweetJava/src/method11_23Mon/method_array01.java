/*
 * 배열을 이용한 최대값, 최소값 구하기
 * 다음 조건을 만족하는 메서드를 정으해 보시오
 * 1.main()
 * 1)정수형 배열data생셩
 * 2)배열 data의 크기는 5 
 * 3)정수 5개를 입력받아 배열 data에 차례대로 저장
 * 4)max(data)메서드를 호출
 * 출력화면)최댓값 = 입력받은 값 중 가장 큰 값
 * 
 * 2.max()
 * 기능) 인자로 받은 data의 값 들 중에서 최대값을 구한다
 * 리턴값)최대값
 */
//package method11_23Mon;
//
//import java.util.Scanner;
//
//public class method_array01 {
//	public static void main(String[] args) {
//		int[] su = new int[5];
//		
//		System.out.println("정수 5개를 입력하시오.>");
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < su.length; i ++) {
//			su[i] = sc.nextInt();
//		}
//	
//		
//	}
//
//	public static int max(data) {
//		int max = su[0];
//	}
//
//	public static int min() {
//		
//	}
//}
package method11_23Mon;

import java.util.Scanner;

public class method_array01 {
	public static void main(String[] args) {
		int data[]  = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하시오.>");
		
		for(int i = 0; i < data.length; i ++) {
			data[i] = sc.nextInt();
		}
		System.out.println("최댓값=" + max(data));
		System.out.println("최솟값=" + min(data));
		sc.close();
	
		
	}

	public static int max(int data[]) {
		int max = data[0];
		for(int i=1; i< data.length; i++) {
			if (max < data[i])
				max = data[i];
			
		}
		return max;
	}

	public static int min(int data[]) {
		int min = data[0];
		for(int i=1; i< data.length; i++) {
			if (min > data[i])
				min = data[i];
			
		}
		return min;
	}
}
