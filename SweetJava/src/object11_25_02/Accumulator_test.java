package object11_25_02;


 class Accumulator_test {
	 public static void main(String args[]) {
	int grandTotal = Accumulator.getGrandTotal();
	System.out.println("�Ѱ� " + grandTotal);

	Accumulator obj1 = new Accumulator();
	Accumulator obj2 = new Accumulator();
	obj1.accumulate(10);
	obj2.accumulate(20);

	//���� �޼��� ȣ�⹮
	grandTotal = Accumulator.getGrandTotal();
//	System.out.println("obj1.total = " + obj1.total);
//	System.out.println("obj1.grandTotal = " + obj2.total);
	//�ν��Ͻ�(�ν��Ͻ��� �Ǿ�� ����Ҽ��ִ� ���� = new�϶�� �̾߱�) �޼��� print()�� ���� �޼����� main()���� ȣ���� ������.
	Accumulator_test s =new Accumulator_test();
	s.print(obj1);//������ƽ�� �ƴ� ������ �ü��ִ�. ��� �̰� ��Ű�� �̸������ͼ� ��ó�� new������ print(obj1); ���� s.print(obj1)�� �ٲ�
	s.print(obj2);//�� �޼��带 ����ϱ� ���� �����?//
	System.out.println("�Ѱ�=" +grandTotal);
	
	 }
	 void print(Accumulator a) { //
		 System.out.println("total =" + a.total);
	 }
	 
	 
}
