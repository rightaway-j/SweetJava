package Calendar11_30;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today { // 자동적으로 extends object함
	private Calendar c1 = new GregorianCalendar();

	public Today() {
	}

	public Today(GregorianCalendar c1) {
		this.c1 = c1;
	}

	public String toString() { // 그 오브젝ㅌ트 중 toString을 사용
		String[] ampm = { "오전", "오후" };
		String[] yo = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH) + 1; // 월이 0부터 11까지 구해져서 1을 더해야한다
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR);
		int ap = c1.get(Calendar.AM_PM);
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);
		// 여기는 출력이 아닌 return문으로 가져가야함 출력(print)는 메인에서
		return y + "년" + m + "월" + d + "일" + " " + ampm[ap] + h1 + ":" + mm + ":" + s + "" + yo[yoil - 1] + "입니다.";
	}// 결과형이 스트링으로 받을 수 있도록 y,m,d등 변수에 담음

}
