package break_;

public class break02for_in_for {
public static void main(String args[]) {
	for (int row = 0; row <3; row++) {
		for (int col = 0; col <5; col++) { //���⼭����
			System.out.println("(" + row + "," + col + ")");
			if ((row == 1) && (col == 3))
				break; // break �� �����ϴ� �ݺ��� ������ ��� �̵��Ѵ�
		}
		
	}//�������
	System.out.println("��.");
}

}
