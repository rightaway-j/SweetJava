package com.naver.myhome;

public class Variable1_float_double_char_boolean {
	public static void main(String[] args) {
		System.out.println("======================������ ����==================");
		//������ ����
		byte b = 10; //1����Ʈ(���� ������ ���� �����ϱ⿡ �����մϴ�.)
		short s = 100; // 2����Ʈ
		int i = 1000; // 4����Ʈ
		
		//8����Ʈ(l[�ҹ��� ��]�Ǵ� L�� ���� �ڿ� ���δ�.)
		long l = 10000L;
		System.out.println(b); //���� b�� ���� ����϶�� �ǹ� 
		//���ڿ� + ������ ��� ���ڿ� ������ ��µǰ� b�� ���� ��µȴ�.
		System.out.println("b=" + b );
		System.out.println("s=" + s );
		System.out.println("i=" + i+ " l=" +l);
		
		System.out.println("============�Ǽ��� ����=========");
		//�Ǽ��� ����
		//f�� F�� ���� �ڿ� ���δ�.
		float ft = (float) 3.14;
		
		//d�� D�� ���� �ڿ� ���̰ų� ������ �� �ִ�+
		double d = 42.195d;
		System.out.println("f=" + ft + " d=" + d );
		
		/* ��ǻ�Ͱ� ���ڹۿ� �𸣱� ������ ���ڰ� ���ڷ� ��ȯ�Ǿ� ����Ǵµ� � �������� ����ɱ��?
		 * ���ڿ� �ش��ϴ� �����ڵ��Դϴ�
		 * 'A' -> 65
		 * :  �� 
		
		  */
		System.out.println("===========������ ����============");
		//������ ���� - �ϳ��� ���ڸ� ��Ÿ�� �� �ִ� �ڷ������� 
		//16��Ʈ�� ���ϱ��� ����Ѵ�.
		char c1 = 'A';//2byte
		char c2 = '@';
		char c3 = '��';
		System.out.println("c1=" + c1
						+ " c2=" + c2 + " c3=" + c3);
						
		/*
		 * ������ ��
		 * 1. char cerror='AB' ; �α��� �Է��ϸ� ����
		 * 2. char cerror_blank=''; �ݵ�� �ϳ��� ���ڰ� �ʿ�
		 */
	
		//�������� ������ �����ϸ� ������ �ش��ϴ� �����ڵ带 ã�Ƽ�
						//������ �����Ѵ�.
		char c4 = 65; // ����'A' �� �ǹ�
		char c5 =  '\uAC00';   // �ѱ� �����ڵ�'��'�� �ǹ�
		System.out.println("c4=" + c4 + " c5=" + c5 );
		
						
		char c6 = 0101;      // 0���� �����ϸ� 8����
		char c7 = 0x41;       //0x�� �����ϸ� 16������ �ǹ�
		char c8 = 0b00001000001; // 0b�� �����ϸ� 2������ �ǹ�
		System.out.println("8���� 0101=" + c6 + "\n"
						+ "16���� 0x41=" + c7
						+ "\n 2 ���� 0b00001000001=" + c8);
		
		System.out.println("============���� ����===========");
		//���� ����
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1�� ����" + b1 );
		System.out.println("b2�� ������ " + b2);

		
	}
}
