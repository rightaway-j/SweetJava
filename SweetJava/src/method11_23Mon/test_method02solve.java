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
public class test_method02solve {
	public static void main(String[]args) {
		
		System.out.println("정수를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		
		int inputdata = sc.nextInt();
		int result = abs(inputdata) ;
			System.out.println("절대값:" + result);
			sc.close();
	}
	public static int abs(int data) {
		if(data<0)
			data = -data;
	return data;	
	}
}
