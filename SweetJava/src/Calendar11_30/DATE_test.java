package Calendar11_30;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DATE_test {
	public static void main(String args[]) {
		//현재 시스템 날짜와 시간 구하는 방법
		//1.클래스 Date이요하는 방법- 현재 시스템 날짜와 시간을 구한다
		Date d = new Date();//Date 생성자 호출
		System.out.println("Date 사용: " + d);
		//System.out.println(new Date());//위 두문장과 같은 의미
		
		SimpleDateFormat sd1= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2= new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(sd1.format(d));//yyyy-mm-dd형태로 출력
		System.out.println(sd2.format(d));//yyyy년mm월dd일형태로 출력
		
		/*
		 * 생성자의 매개변수는 날짜와 시간의 포맷을 작성하여 넘겨준다
		 * 패턴문자 의미 (대소문자 구분 하기)
		 * y	년
		 * M	월
		 * d	일
		 * D	일(1~365)
		 * E	요일
		 * a	오전/오후
		 * H	시(0-23)
		 * h	시(1-12)
		 * m	분
		 * s	초
		 * S	1/1000초
		 */
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년MM월dd일 a hh시 m분 s초 E요일"); //h하나쓰면 3hh두개쓰면 03
		System.out.println(sdf.format(d));
		
		//System클래스를 이용해서 시스템의 밀리초 구하기
		//(국제표준시각(UTC, GMT)1970/1/1/0/0/0으로 부터 경과한 시각)
		System.out.println(System.currentTimeMillis()+"밀리초");
		
		
		
	}
}
