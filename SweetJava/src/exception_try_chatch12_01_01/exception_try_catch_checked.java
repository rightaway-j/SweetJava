//checked exception에 해당- 컴파일 에러 발생
//해결책: try ~chtch  문으로 처리 또는 메서드 밖으로 던짐
package exception_try_chatch12_01_01;

public class exception_try_catch_checked {
	public static void main(String args[]) {
		int sum = 1 + -2;				//변수 선언은 필드에,  try,catch문 다 적용할 거니까
		try {
			if (sum < 0)
				throw new Exception("에러 발생");//throw 필수 작성 ()괄호 안에 경우가 true일경우 thow해라
			System.out.println(sum); //if 문이 false인경우는 if를 벗어나서 sum을 출력하라
		} catch (Exception e) {
			String str = e.getMessage();	//	e.getMessage가 하는 일은?	
			System.out.println(str);
		}
	}

}
