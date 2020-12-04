/*
 * 다음 조건을 만족하는 메서드를 정의해라
 * 1.main()
 * 1) 두개의 정수(a,b)를 입력
 * 2) max(a,b)를 호출하여 최대값을 출력
 * 출력화면) 최대값= 입력받은 값 중 큰 값
 * 
 * 2.max()
 * 기능) 인자로 받은 데이터 2개 중에서 최대값을 구한다
 * 리턴값)최대값
 * 3.min()
 * 기능 ) 인자로 받은 데이터 2개 중에서 최소값을 구한다
 * 리턴값) 최소값
 * 
 */
package method11_23Mon;
import java.util.Scanner;
public class test_method03_min_max {
	public static void main(String[]args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("두개의 정수를 입력하세요>");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int result = max(a,b);
	
	System.out.println(" 최댓값:" + max);
	
		 
		 
	}
	public static int max(int a, int b) {
		if(a < b) {
		 System.out.println("max ="+ a);
		}else {
		 System.out.println("max ="+ b);
		 return 
		}
	}
}
