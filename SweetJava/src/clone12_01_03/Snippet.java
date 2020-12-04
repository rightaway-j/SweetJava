/*
 * clone()�޼ҵ�� ��ü�� �����ϴ� ����� �Ѵ�. ��, �Ȱ��� ���� ���� ��ü�� �� �� �� ����ϴ�. ���� ������ Ŭ������ ���ؼ��� ȣ�� �� �� �ִ�.
 * ���� ������ Ŭ���� Cloneable�������̽� ���� �����̴�. (Cloneable�������̽��� �θ�� ������)
 * 
 * Cloneable �������̽��� ������ GregorianCalendar Ŭ������ ���ؼ� clone()�޼ҵ带 ȣ���ϴ� ����
 */
package clone12_01_03;
//clone()�޼ҵ带 ȣ���ϴ� ����
import java.util.GregorianCalendar;
public class Snippet {
	public static void main(String[] args) {
		//��ü�� ����
		GregorianCalendar obj1 = new GregorianCalendar(2020,11,1);
		//clone�޼���� ��ü�� �����Ѵ�.
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)imsi;
		//�� �ι����� �� �������� ǥ���ϸ� ������ �����ϴ�.
		//GregorianCalendar obj2 = (GregorianCalendar) obj1.clone();//Object������ �°��� downCasting�ؼ� ���� �ִ�.
		
		//%tF : ���� ���ڴ� ��¥�� yyyy-MM-dd�������� �����ϴ� ������ �Ѵ�.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2021,3,28);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
	}
}

