package interface11_26_05.copy;

public class Interface_Ex {
	public static void main(String args[]) {
		Lendable arr0, arr1, arr2;
		// arr0 - new Lendable(); // ���� �߻�
		arr0 = new SeparateVolume("445o", "Ǫ���� ����", "����");
		arr1 = new SeparateVolume(" 349.3", "����̼���", "���긮ġ");
		arr2 = new AppCDInfo(" 02-17", "xml�� ���� �ڹ� ���α׷���");

		// ���� ����� ���� ��¥�� ���ົ 2�ǰ� �η� cd�� ������ ���
		checkOut(arr0, "����", "2020-11-26");
		checkOut(arr1, "����", "2020-11-26");
		checkOut(arr2, "����", "2020-11-26");

	}
	
	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼ҵ峪  
	// �ʵ��� ���� ���θ� üũ�ϱ� ������
	// Lendable�������̽��� checkOut�޼ҵ尡 �վ�� ������ ������ �����ϴ�.
	static void checkOut(Lendable arr, String borrower, String date) {
		arr.checkOut(borrower, date);
	}
}
