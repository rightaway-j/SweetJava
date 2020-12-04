package Calendar11_30;
//현재 날짜와 시간 출력하기
//2020년  11월 30일 오전 10:57:56월요일 입니다.
import java.util.*;
public class Ex2 {
	public static void main(String args[]) {
		String []ampm = {"오전","오후"};
		String[] yo = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
	
		//특정 날짜에 대한 정보를 얻고자 할때 생성자 년,월, 일을 인자로 넘긴다.
		Calendar c1 = new GregorianCalendar(2020,2,1);
		
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH)+1; //월이 0부터 11까지 구해져서 1을 더해야한다
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR);
		int ap = c1.get(Calendar.AM_PM);
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);
		
		System.out.print(y + "년"+ m + "월" + d + "일");
		System.out.print(" " + ampm[ap]);
		System.out.print(h1 +":" + mm + ":" + s + "");
		System.out.println(yo[yoil-1]+ "입니다.");
		
		
//		System.out.println("현재날짜와 시간 출력하기");
//		System.out.print(today.get(Calendar.YEAR) + "년 ");
//		System.out.print(today.get(Calendar.MONTH) + 1 +"월 ");
//		System.out.print(today.get(Calendar.DATE) + "일 ");
//		int a = today.get(Calendar.AM_PM);
//		if(a == 0) { //같은지 판단할때는 ==두개 써야함 =한개는 대입
//			System.out.print("오전 ");
//		}else {
//			System.out.print("오후 ");
//		}
//		System.out.print(today.get(Calendar.HOUR)+":");
//		System.out.print( today.get(Calendar.MINUTE)+":");
//		System.out.print(today.get(Calendar.SECOND)+" " );
//		System.out.print(today.get(Calendar.DAY_OF_WEEK)+"요일");
//		
		
				
			
		}
	}

