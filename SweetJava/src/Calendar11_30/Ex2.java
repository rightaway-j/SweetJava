package Calendar11_30;
//���� ��¥�� �ð� ����ϱ�
//2020��  11�� 30�� ���� 10:57:56������ �Դϴ�.
import java.util.*;
public class Ex2 {
	public static void main(String args[]) {
		String []ampm = {"����","����"};
		String[] yo = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		
	
		//Ư�� ��¥�� ���� ������ ����� �Ҷ� ������ ��,��, ���� ���ڷ� �ѱ��.
		Calendar c1 = new GregorianCalendar(2020,2,1);
		
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH)+1; //���� 0���� 11���� �������� 1�� ���ؾ��Ѵ�
		int d = c1.get(Calendar.DATE);
		int h1 = c1.get(Calendar.HOUR);
		int ap = c1.get(Calendar.AM_PM);
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int yoil = c1.get(Calendar.DAY_OF_WEEK);
		
		System.out.print(y + "��"+ m + "��" + d + "��");
		System.out.print(" " + ampm[ap]);
		System.out.print(h1 +":" + mm + ":" + s + "");
		System.out.println(yo[yoil-1]+ "�Դϴ�.");
		
		
//		System.out.println("���糯¥�� �ð� ����ϱ�");
//		System.out.print(today.get(Calendar.YEAR) + "�� ");
//		System.out.print(today.get(Calendar.MONTH) + 1 +"�� ");
//		System.out.print(today.get(Calendar.DATE) + "�� ");
//		int a = today.get(Calendar.AM_PM);
//		if(a == 0) { //������ �Ǵ��Ҷ��� ==�ΰ� ����� =�Ѱ��� ����
//			System.out.print("���� ");
//		}else {
//			System.out.print("���� ");
//		}
//		System.out.print(today.get(Calendar.HOUR)+":");
//		System.out.print( today.get(Calendar.MINUTE)+":");
//		System.out.print(today.get(Calendar.SECOND)+" " );
//		System.out.print(today.get(Calendar.DAY_OF_WEEK)+"����");
//		
		
				
			
		}
	}

