package String11_27_08;
import java.util.Scanner;
public class StringEx4 {
	public static void main(String args[]){
		//���ϸ��� �Է¹޾� Ȯ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���>");
		
		//String filename = sc.next();
		String filename = sc.nextLine();//����� ������ enterġ�� ������\
		
		int index = filename.lastIndexOf("."); //.�ڸ� �������� �޼���
		if(index == -1) {
			System.out.println("���ϸ��� ��Ȯ�ϰ� �Է��ϼ���.");
			
		}else {
			String result = filename.substring(index +1);
			System.out.println(result);
		}
		sc.close();
		
	}
	
}
