package Wrapper12_01_07;
//�⺻�� ��=> Wrapper��ü�� �ڵ�(����) Boxing
public class auto_boxing {
	public static void main(String args[]) {
		printDouble(new Double(123.45));
		
		//double Ÿ���� ���� ������   DoubleŸ�����ڸ� �޴� �޼ҵ带 ȣ���Ѵ�.
		printDouble(123.45);
		//���������� printDouble(Double.valyeOf(123.456D));�� ��ȯ�Ѵ�.
		
	}
	
	//�ڵ�(����)Boxing
	static void printDouble(Double obj) {
		System.out.println("obj = " + obj);
		System.out.println("obj.doubleValue() =" + obj.doubleValue());
		System.out.println("obj.toString()="+ obj.toString());
	}
}
