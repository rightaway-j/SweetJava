package interface11_26_05.copy;

public class Interface_Ex_array {
	public static void main(String args[]) {
		//int[] a = new int [3];
		//String[] a = newSring [3]; ó�� ������ 
		Lendable arr[]= new Lendable[3];// �������̽� Ÿ���� �迭
		
		//������ ���� Ÿ���� ��ü �ּ� ����
		
		arr[0] = new SeparateVolume("445o", "Ǫ���� ����", "����");
		arr[1] = new SeparateVolume(" 349.3", "����̼���", "���긮ġ");
		arr[2] = new AppCDInfo(" 02-17", "xml�� ���� �ڹ� ���α׷���");

		checkOutAll(arr, "����", "2020-11-26");
		
	}
	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼ҵ峪
	//�ʵ��� ���� ���θ� üũ�ϱ� ������
	//lendable �������̽��� üƮ�ƿ� �޼ҵ尡 �־�� ������ ������ ����
	
	//lendable �� checkOut�� �ִ� �� Ȯ���ϰ�,
	private static void checkOutAll(Lendable[] arr, String borrower, String date) {
		// TODO Auto-generated method stub
		//arr[0].checkOut(borrower,date);
		//arr[1].checkOut(borrower,date);
		//arr[2].checkOut(borrower,date);
		/*�Ǵ�
		 * for(int cnt = 0; cnt < arr.length; cnt++)
		 * arr[cnt].checkOut (borrower,date);
		 �Ǵ�*/
		for(Lendable a: arr) {
			a.checkOut(borrower, date);//������ ��ü��
			
		}
	}


//	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼ҵ峪  
//	// �ʵ��� ���� ���θ� üũ�ϱ� ������
//	// Lendable�������̽��� checkOut�޼ҵ尡 �վ�� ������ ������ �����ϴ�.
//	static void checkOut(Lendable arr, String borrower, String date) {
//		arr.checkOut(borrower, date);
	}

