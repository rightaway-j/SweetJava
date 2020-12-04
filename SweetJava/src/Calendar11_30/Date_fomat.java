package Calendar11_30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormatŬ������ ����Ͽ� �� ��¥ ���̸� ���ϴ� ���α׷�
//String => Date������ ��ȯ
public class Date_fomat {
	public static void main(String args[]) {
		 String start = "2020-11-1";
		 String end = "2020-11-30";
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 //parse���� ������� ����ó�� �ϱ����� try catch�� ���
		 try {
			 //String ->Date������ ��ȯ
			 Date beginDate = dateFormat.parse(start);
			 Date endDate = dateFormat.parse(end);
			 
			 System.out.println(beginDate);
			 System.out.println(endDate);
			 System.out.println(endDate.getTime());
			 System.out.println(beginDate.getTime());
			 long diff = endDate.getTime() - beginDate.getTime();//��ĥ �������� ���̸� ����
			 //1�� = 24 �ð� *60�� *60��*1000(�и�������)
			 long diffDays = diff/(24 *60 *60 *1000);
			 System.out.println(diffDays + "���� �������ϴ�.");
		 } catch (ParseException e) {
			 e.printStackTrace();//error�޼���(����ٿ� �� ���´�.)
		
		 }
	}
}
