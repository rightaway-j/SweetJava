package break_;

public class Continue {
public static void main(String args[]) {
//	for(int n=1; n <=9; n++) {
//		if( n == 4);
//		break;
//		System.out.println(n);
//	}
	//5�� ������� �ʴ´�
	for (int cnt =0; cnt <10; cnt++) {
		if (cnt != 5)
			System.out.println(cnt);
	}
	System.out.println("=====================");
	for (int cnt =0 ; cnt < 10; cnt++) {
		if (cnt == 5)
			continue;
		System.out.println(cnt);
	
	}
	System.out.println("End");
	
	System.out.println("=======continue����� �߸� �� ��");
	int cnt = 0;
	while (cnt <10 ) { //���⼭ ����  //
		if (cnt == 5)
			continue; //������� ��� 5�ε��� �ִ� �� , continue ���� ������ �ɷ��� ���� 6���� ������ �ȵ�
		
		System.out.println(cnt);
		cnt++;//�� ������ ������ ���� �ɷ��� �ȵ� 
		
	}
	System.out.println("Done.");
}
}
