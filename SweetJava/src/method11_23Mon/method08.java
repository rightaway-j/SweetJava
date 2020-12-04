/*1.해당 소스에서 ctrl + f11
 * package Explorer에서 소스를 선택 후 오른쪽 마우스 버튼 클릭
 * - run as - run configurations - 오른쪽 화면의 arguments탭 선택 후
 * program arguments  상자에서 값을 입력합니다.
 * -두개이상 사용시에는 blank또는 엔터로 구분합니다.
 */
package method11_23Mon;

public class method08 {
	public static void main(String[] args) {
		for (int i = 0 ; i <args.length; i++ ) {
			System.out.println(args[i]); //개수의 제한을 .length로 잡아줌
		}
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);//값이 3개가 들어가야함

	}
}