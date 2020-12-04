package object_Numbers_array11_24;

import java.util.Scanner;

public class Numbers_test2 {
	public static void main(String args[]) {
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요");
	
		//미완성
		Numbers2 obj2 = new Numbers2(
				new int[] { 10,20,30,40,50,60,70,80,90,100});
		print(obj2);
		
		}
		
		static void print(Numbers2 obj) {
			System.out.println("합계=" + obj.getTotal());
			System.out.println("평균= " +obj.getAverage());
	}
}
