package exception_try_chatch12_01_01;

public class exceptionExample02 {
	public static void main(String args[]) {
		try {								//받아온 에러문을 try chtch와 이어준다
			
			int result = add(1, -2);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("에러 발생했습니다.");
		}
	}

	static int add(int a, int b) throws Exception {//에러 발생시 이것을 발생시킨 곳으로 던져진다
		int result = a + b;
		if (result < 0)
			throw new Exception("에러발생"); //
		return result;
	}
}
