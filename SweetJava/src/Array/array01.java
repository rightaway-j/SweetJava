package Array;
//���������� �ܼ�ȭ, java�� 0���� �����Ѵ� element�� index�� ���� �迭�� �̷� /�迭�� ������(�������� �ּ�)
public class array01 { // class�κ��� ��ä�� �����Ѵ� sc. scanner = new scanner ���⼭ new
	public static void main(String args[]) { //[] ���� �޼ҵ忡 ����ϴ� ��ȣ
		int arr[]; // �迭 ������ ����
		arr = new int[10]; //�迭 ����, �迭�� ũ�� 10�� ����
		
		//�迭 ���
		arr[0] = 10;//
		arr[1] = 20;
		arr[2] = arr[0]+ arr [1];
		System.out.println("dd");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]);
		System.out.println(arr[8]);
		//System.out.println(arr[10]); //���� �߻�java.lang.ArrayIndex OutOfBounds Exception
	}
}
