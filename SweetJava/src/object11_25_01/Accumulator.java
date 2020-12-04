package object11_25_01;
//���� �ʵ尡 �ִ� Ŭ����
// total �ʵ�� ��ü���� ���� ��������
// grandTotal �ʵ�� Ư�� ��ü�� ������� Ŭ���� ��ü�� �ϳ��� ����� ���� �ʵ��̴�.
class Accumulator {

	int total = 0;
	static int grandTotal = 0; // ���� �ʵ带 �����ϴ� ����
	
	void accumulate(int amount) {
		total += amount;
		
		//���� �ʵ忡 amount �Ķ���� ���� ���ϴ� ���Թ�
		
		grandTotal += amount;
	}
}
