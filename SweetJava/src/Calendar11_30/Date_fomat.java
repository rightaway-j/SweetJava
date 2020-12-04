package Calendar11_30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat클래스를 사용하여 두 날짜 차이를 구하는 프로그램
//String => Date형으로 변환
public class Date_fomat {
	public static void main(String args[]) {
		 String start = "2020-11-1";
		 String end = "2020-11-30";
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 //parse에서 만들어진 예외처리 하기위해 try catch문 사용
		 try {
			 //String ->Date형으로 변환
			 Date beginDate = dateFormat.parse(start);
			 Date endDate = dateFormat.parse(end);
			 
			 System.out.println(beginDate);
			 System.out.println(endDate);
			 System.out.println(endDate.getTime());
			 System.out.println(beginDate.getTime());
			 long diff = endDate.getTime() - beginDate.getTime();//며칠 지났는지 차이를 구함
			 //1일 = 24 시간 *60분 *60초*1000(밀리세컨드)
			 long diffDays = diff/(24 *60 *60 *1000);
			 System.out.println(diffDays + "일이 지났습니다.");
		 } catch (ParseException e) {
			 e.printStackTrace();//error메세지(몇번줄에 뭐 나온다.)
		
		 }
	}
}
