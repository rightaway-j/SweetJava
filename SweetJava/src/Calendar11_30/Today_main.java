package Calendar11_30;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today_main {
	public static void main(String[]args) {
		System.out.println("=====오늘의 날짜====");
		 Today t = new Today();
		 System.out.println(t.toString());
		 System.out.println(t);
	}  //@가 붙었다는 것은 toStrin 이 실행되지 않고 class  내부적으로 돌고있는것이 나온것
	
}
