package object11_25_02;
//���� �ʵ尡 �ִ� Ŭ����
class Accumulator {

	int total = 0;
	static int grandTotal = 0; 
	
	void accumulate(int amount) {
		total += amount;
	
		
		grandTotal += amount;
	
		
	}
	/*���� �޼��� �ȿ����� �ν��Ͻ� ����, �ν��Ͻ� �޼����� ����.
	 * �ν��Ͻ� ������ �ν��Ͻ� �޼���� ��ü ������ ����� �� �ִ� ������̱� ������
	 * �ν��Ͻ� ������ ���þ��� static �޼��� �ȿ����� ����� �� �����ϴ�.
	 * ���� this�� ����� �� ����
	 */
	static int getGrandTotal() {//���� �޼��� ����//static
		//total = 5; //�����߻�//static�� ���� �ö�����-��ü�������� �ʾƵ� (��������� �ð��� �ٸ�)//new �� ���� ������ ���� ������� ����
		//accumulate(100); //�����߻� (static �ȿ��� ��� ���Ѵ�)
		return grandTotal;
	}
}
