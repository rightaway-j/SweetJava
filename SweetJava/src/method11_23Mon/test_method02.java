/*
 * 정수를 입력 받아 inputdata에 저장
 * abs(inputdata)호출
 * abs()메서드의 반환형은 int형 
 * 
 * 출력결과:
 * 정수를 입력하세요?-3
 * 절대값: 3
 * 
 * 출력결과:
 * 정수를 입력하세요?=3
 * 절대갓:3
 */
package method11_23Mon;
import java.util.Scanner;
public class test_method02 {
	public static void main(String[]args) {
		System.out.println();
	}
	public static int abs(int inputdata) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요>");
		 inputdata = sc.nextInt();
		 if(inputdata <0) {
			System.out.println("절대값:" + -(inputdata));
		 }
	return ;	
	}
}
