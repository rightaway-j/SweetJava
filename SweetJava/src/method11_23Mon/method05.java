package method11_23Mon;

public class method05 {
	public static void main(String[] args) {
		sum(10);//�޼��� ȣ��(�޼��� ����), 10:����
		sum(100);
		sum(1000);
		return;//(���� ����)
//		int sum=0;
//		for (int i=1; i<=10; i++)
//			sum += i;
//		System.out.println("��(1~10:)" + sum);
//		
//		sum=0;
//		for (int i=1; i<=100; i++)
//			sum += i;
//		System.out.println("��(1~100):" + sum);
//		
//		sum=0;
//		for (int i=1; i<=1000; i++)
//			sum += i;
//		System.out.println("��(1~1000):" + sum);
	}
	
	public static void sum(int end) { //main �� �ִ� ������ sum�� ����, -�ݺ� �Ǳ� ������, ���ϴ� ���� i<=10�̺κ��� end�� ������ main���� ������ 
		int sum=0;
		for (int i=1; i<=end; i++)
			sum += i;
		System.out.println("��(1~" + end + "):" + sum);
		
		return; //���⼭�� �ʼ�,���ư����� ���� �� ���������ϱ� ����
	}
	
}
