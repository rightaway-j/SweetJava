package Calendar11_30;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DATE_test {
	public static void main(String args[]) {
		//���� �ý��� ��¥�� �ð� ���ϴ� ���
		//1.Ŭ���� Date�̿��ϴ� ���- ���� �ý��� ��¥�� �ð��� ���Ѵ�
		Date d = new Date();//Date ������ ȣ��
		System.out.println("Date ���: " + d);
		//System.out.println(new Date());//�� �ι���� ���� �ǹ�
		
		SimpleDateFormat sd1= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2= new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println(sd1.format(d));//yyyy-mm-dd���·� ���
		System.out.println(sd2.format(d));//yyyy��mm��dd�����·� ���
		
		/*
		 * �������� �Ű������� ��¥�� �ð��� ������ �ۼ��Ͽ� �Ѱ��ش�
		 * ���Ϲ��� �ǹ� (��ҹ��� ���� �ϱ�)
		 * y	��
		 * M	��
		 * d	��
		 * D	��(1~365)
		 * E	����
		 * a	����/����
		 * H	��(0-23)
		 * h	��(1-12)
		 * m	��
		 * s	��
		 * S	1/1000��
		 */
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy��MM��dd�� a hh�� m�� s�� E����"); //h�ϳ����� 3hh�ΰ����� 03
		System.out.println(sdf.format(d));
		
		//SystemŬ������ �̿��ؼ� �ý����� �и��� ���ϱ�
		//(����ǥ�ؽð�(UTC, GMT)1970/1/1/0/0/0���� ���� ����� �ð�)
		System.out.println(System.currentTimeMillis()+"�и���");
		
		
		
	}
}
