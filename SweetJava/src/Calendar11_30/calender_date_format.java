package Calendar11_30;

import java.text.SimpleDateFormat;
import java.util.*;

public class calender_date_format {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();

		// calendar.getTime():calendar��ü�� ������ �ִ� ��¥�� �ð��� �Ȱ���
		// ������ ���� Date ��ü�� ���� �����ϴ� �޼����̴�.
		System.out.println(calendar.getTime());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� M�� dd�� a h�� m�� s�� E����");
		System.out.println(sdf.format(calendar.getTime())); //Date������ ��ȯ�ؼ� ����ϴ°�

	}
}
