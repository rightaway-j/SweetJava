package intergace_Constatnt11_26_07;

public class Inteface_Ex {
	public static void main(String args[]) {
		SeparateVolume obj = new SeparateVolume("864��","����","��������");
		//���� ������ Ȯ���ϰ� ������°� �����ϸ�"���Ⱑ��"�� �������
		//�������̸� �����߰� ������, �������� ����Ѵ�.
		printState(obj);
		obj.checkOut("����", "2020-11-26");
		printState(obj);
	}

	private static void printState(SeparateVolume obj) {
		if (obj.state == Lendable.STATE_BORROWED) {
			System.out.println("�������: ���Ⱑ��");
		}else if(obj.state == Lendable.STATE_NORMAL){
			System.out.println("�������: ������");
			System.out.println("������"+ obj.borrower);
			System.out.println("������"+ obj.checkOutDate);
		}
		
	}
	
	
}
