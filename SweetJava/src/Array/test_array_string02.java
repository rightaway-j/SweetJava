package Array;

import java.util.Scanner;

public class test_array_string02 {
	public static void main(String args[]) {
	 String names[] = { "ȫ�浿", "�̼���", "ȫ�浿 ", "�������", "��浿"};
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("�˻��� �̸��� �Է��ϼ���>");
	 String name = sc.next();
	 System.out.println("�̸�::" + name);
	 if(name.equals(names)) {
		 System.out.println(name + "�� �迭��" + "�濡�� ã�ҽ��ϴ�."); 
	 }
	 
	 
//	 else(name.equals(names)){
//		 System.out.println(name + "�� �迭���� ã�� ���߽��ϴ�.");
//	 }

//	 for (int i = 0; i < name.length; i++) {
//		 
//		 System.out.println(name[i]);
	 sc.close();
		}
}
