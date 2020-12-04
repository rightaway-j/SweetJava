package Calendar11_30;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Today { // �ڵ������� extends object��
	private Calendar c1 = new GregorianCalendar();

	public Today() {
	}

	public Today(GregorianCalendar c1) {
		this.c1 = c1;
	}

	public String toString() { // �� ��������Ʈ �� toString�� ���
		String[] ampm = { "����", "����" };
		String[] yo = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH) + 1; // ���� 0���� 11���� �������� 1�� ���ؾ��Ѵ�
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR);
		int ap = c1.get(Calendar.AM_PM);
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);
		// ����� ����� �ƴ� return������ ���������� ���(print)�� ���ο���
		return y + "��" + m + "��" + d + "��" + " " + ampm[ap] + h1 + ":" + mm + ":" + s + "" + yo[yoil - 1] + "�Դϴ�.";
	}// ������� ��Ʈ������ ���� �� �ֵ��� y,m,d�� ������ ����

}
