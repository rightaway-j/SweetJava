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
 * 참조형을 사용하면 여러개의 값을 가져올 수 있다.
 */
package method11_23Mon;
import java.util.Scanner;
public class test_method03_min_max2_solve02 {
	public static void main(String[]args) {

	int [] data = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 5개를 입력하세요>");
	for(int i = 0 ; i <data.length; i++)
		data[i] = sc.nextInt();
	 
	int[]result = max_min(data);//메서드 호출 (실행) 얘랑
	
	
	System.out.println(" 최댓값:" + result[0]);
	System.out.println(" 최솟값:" + result[1]);
	
		 sc.close(); //잊지않기
		 
	}
	public static int[] max_min(int data[]) { //편의를 위해 data의 이름을 같은걸로 해줌
/*		int[] result = new int[2];
//		result[0] = data[0];
//		result[1] = data[0];
	*/	
		int result[] = {data[0], data[0]};
		
		for (int i= 1; i< data.length; i++) {
			if(result[0] < data [i]) result[0] = data[i]; //max
			if(result[1] > data [i]) result[1] = data[i]; //min
		}
		return result;
	
		
		}
	
	}

