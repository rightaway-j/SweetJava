package Calendar11_30;

import java.util.GregorianCalendar;
import java.util.Calendar;
public class test_overring {
	public static void main(String args[]) {
		GregorianCalendar c  = new GregorianCalendar();
		c.add(Calendar.DATE, 1);
		System.out.println("1������ �� = " + c.get(Calendar.DATE));
		print(c);
		
		c.add(Calendar.MONTH, 1);
		System.out.println("1������ ��= " + c.get(Calendar.MONTH));
		print(c);
		
		c.add(Calendar.YEAR, 1);
		System.out.println("1 ������ �⵵ = " + c.get(Calendar.YEAR));
		print(c);
		
		c.add(Calendar.DATE, -1);
		System.out.println("1 ���ҵ� �� = " + c.get(Calendar.DATE));
		print(c);
	
		 
		c.add(Calendar.MONTH, -1);
		System.out.println("1 ���ҵ� �� = " + c.get(Calendar.MONTH));
		print(c);
		
		c.add(Calendar.YEAR, -1);
		System.out.println("1 ���ҵ� �⵵ = " + c.get(Calendar.YEAR));
		print(c);
	}

	private static void print(GregorianCalendar c) {
		Today t = new Today(c);
		System.out.println(t + "\n");
		
	}

	
}

