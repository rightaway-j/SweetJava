package method11_23Mon;

public class method06 {
	public static void main(String[] args) {
		method04.printCharacter('=', 20); //�Ʊ� �����״� method04 class�� method������./static��ü�������� ��밡���ϱ⿡ �����ٰ� �ٷ� �� �� �ִ�.
		System.out.println("��(1~10):" + sum(10));// ȣ�� ���1
		method04.printCharacter('=', 20);
		System.out.println("��(1~100):" + sum(100));
		method04.printCharacter('=', 20);
		int result = sum(100);//sum�̶�� �ƴϴ� ��ȯ���� int�̰� ���ڰ��� ������� �Ű�������int���̴�.
		System.out.println("��(1~100):" + result);
		method04.printCharacter('=', 20);
		result = sum(1000);// ȣ����2 //������ int�� ���� �������༭ ����� �����൵ ��.
		System.out.println("��(1~1000):" + result);// �޼��� ȣ��(�޼��� ����), 10:����
	}

	public static int sum(int end) { // main �� �ִ� ������ sum�� ����, -�ݺ� �Ǳ� ������, ���ϴ� ���� i<=10�̺κ��� end�� ������ main���� ������
		int sum = 0;// sum�� �Ѱ��ٰű⶧���� void ���� int�� ����
		for (int i = 1; i <= end; i++)
			sum += i;
//		System.out.println("��(1~" + end + "):" + sum); //�̹����� �ּ�ó���ϸ� �ƹ��� ����� ����.
		return sum;// �����ְ� ������ i �̸� ���� ����

		// return; //���⼭�� �ʼ�,���ư����� ���� �� ���������ϱ� ����
	}

}
