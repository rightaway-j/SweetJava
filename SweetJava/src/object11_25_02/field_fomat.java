//초기화 블록으 ㄹ포함하는 클래스의 예
/*멤버변수(필드)의 초기화 방법
 * 1.명시적 초기화 - 변수 선언과 동시에 초기화 하는것(간단하고 명료)
 * 예)int sum=0; //기본형 변수의 초기화
 * Circle c = new Circle();//참조형 변수의 초기화
 * 
 * 2.생성자
 * 
 * 3. 초기화 블럭: 복잡한 초기화 작업이 필요할 때 사요합니다.
 * 1)인스턴스 변수 초기화 블럭 : 인스턴스 변수를 초기화 하느데 사용
 * -인스턴스 변수가 생성될 때마다 각 인스천스별로 초기화가 이루어지빈다.
 * - 인스턴스 변수의 초기화 순선: 기본값-> 명시적 초기화
 * 							->인스턴스 초기화 블럭-> 생성자
 * - 단순히 클래스 내에 블럭{} 만들고 그안에 코드를 작성하면 됨
 * 모든 생성자에서 공통으로 수행되어야 하는 코드를 주로 사용
 * 2)클래스 변수 초기화 블럭: 클래스 변수를 초기화 하는데 사용
 * 클래스 변수가 처음 로딩될 때 단 한번 초기화 됨
 * -클래스 변수의 초기화 순서:기본값-> 명시적 초기화=> 클래스 포기화 블럭
 * =형식) static{}
 * 
 */
package object11_25_02;

public class field_fomat {
	static int arr[];//스테이틱 블럭에 참조형을 넣음
	field_fomat(){//new를 해주지 않은 참조형이기에 기보갑ㅅnull 이나옴 .. 
		System.out.println("여기는 생성자 입니다");
		
	}
	/*클래스초기화(정적 초기화)블록
	 * 클래스가 사용ㄱ되기 전에 단 한번 호출(정적필드 초기화에 주로 사용)
	 */
	static {
		System.out.println("클래스 초기화 블럭");
		//1.100개의 크기를 갖는 1차원 배열 엘리먼트 생성
		arr = new int[100];
		
		//2.인덱스에 해당하는 값을 배열의 값으로 설정한다
		//arr[0] = 0; arr[1] = 1; arr[2] = 2;......;arr[99]=99;
		
		
		//3.출력한 갑슬 출력합니다.
		//012345.....
			for(int cnt=0; cnt < arr.length; cnt++) {
				arr[cnt] = cnt; //배열을 출력하면 무조건 0이됨 그래서 arr[cnt]가아닌 cnt로 해야함
						System.out.print( arr[cnt] + "\t");
			}
		
		System.out.println();
		
		
		
	}
	//인스턴스 초기화 블럭;
	{
		System.out.println("인스턴스 초기화 블럭");
	}
}















