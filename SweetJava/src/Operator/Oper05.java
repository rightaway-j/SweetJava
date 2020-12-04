package Operator;

public class Oper05 {
	 public static void main(String args[]) {
		//소문자를 대문자로 변환하는 프로그램
		 char lower = 'c';
//		 char  = Character.toUpperCase(lower);
//		 System.out.println(lower);
//			 
	 int upper_int = lower -32; //유니코드표 사용 아스키코드 사이의 차이가 -32
	 System.out.printf("%c  => %c\n", lower, upper_int); //숫자형이 나오지만 캐릭터 형으로 변환해서 출력해라
	 
	 }
	 
}
