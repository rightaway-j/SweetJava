package com.naver.myhome;
	 /*
	  * 1. System.out.println() : ��ȣ���� ������ ����� �� �� ���� ���ϴ�.
	  * 2. system.out.print() : ��ȣ���� ������ ����� �� �� ���� ���� �ʰ� �����մϴ�.
	  * 3. system.out.printf() : ������ �����ؼ� ����մϴ�.
	  		����: System.out.printf( "���� �����", ������)
	       	������: %�� �����ϴ� ���� ������ �������� ������ ��ġ�ؾ� �մϴ�.
	  */
	 // ���ͳ�(literal)- �� ��ü�� ���� �ǹ� �ϴ� ��
public class First1_Ln_f {
	public static void main(String args[]) {
		System.out.println("��¼���!!");//���ڿ�
		System.out.println(30); // ����
		System.out.println(3.14); //�Ǽ�
	    System.out.println('A'); //����
	    System.out.println(true); //��(�Ҹ�)
	    System.out.println(false); 
	    System.out.println("====== println() �� ========"); //���ڿ�

	    System.out.print("��¼���!!");//���ڿ�
		System.out.print(30); // ����
		System.out.print(3.14); //�Ǽ�
	    System.out.print('A'); //����
	    System.out.print(true); //��(�Ҹ�)
	    System.out.print(false); 
	    System.out.println("====== println() �� ========"); //���ڿ�
	    
	    // �Ǽ� 42.195�� �Ǽ� ����(%f)���� ����ض�
	    // (�⺻ �Ҽ������� 6�ڸ�)
	    System.out.printf("%f", 42.195);
	    System.out.println();//�� �ٲپ��
	    
	    //�Ǽ� 42.195�� �Ǽ� ���� �Ҽ��� ���� 2�ڸ�(%.2f)�� ����ض�. �Ҽ��� �Ʒ� 3�ڸ����� �ݿø�
	    // \n(%n)�� ��� �� �� �ٲٶ�� ����
	    System.out.printf("%.2f%n", 42.195);
	    
	    // ���� 42�� ���� ����(%d)���� ����ض�
	    System.out.printf("%d", 42); //d- ���� c-ĳ���� char
	    
	    
	   
	    //���� �̸��� ȫ�浿, ���� ���̴� 21�� �Դϴ�.
	    System.out.printf("\n���� �̸��� %s, ���� ���̴� %d�� �Դϴ�.", "ȫ�浿", 21);
	    
	    //���ڳ������_ $�޷���ȣ�� �ݵ�� ����
	    	//Ŭ���� �̸��� �빮�ڷ� ����, �޼ҵ�,����, �迭,���ڿ��� �ҹ��ڷ� ����
	    //
	    //�ڷ���
	    //-��1, ���� char 2 byte 1 short 2, ���� int 4 long 8, �Ǽ�4 double 8 =>�⺻��
	    //=>������(reference Type): ���� ���� �ִ� �ּ� �����,
	    //�̷��� �����-Ŭ����, �迭, �������̽�, ������
	    //ex) string s1 = "�ڹ�";
	    // String s2 = new String("�ڹ�"); �빮�� ���= Ŭ����
	    
	    
	}

}
