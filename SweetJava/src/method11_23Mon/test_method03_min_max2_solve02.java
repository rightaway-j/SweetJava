/*
 * ���� ������ �����ϴ� �޼��带 �����ض�


 * 1.main()
 * 1) �ΰ��� ����(a,b)�� �Է�
 * 2) max(a,b)�� ȣ���Ͽ� �ִ밪�� ���
 * ���ȭ��) �ִ밪= �Է¹��� �� �� ū ��
 * 
 * 2.max()
 * ���) ���ڷ� ���� ������ 2�� �߿��� �ִ밪�� ���Ѵ�
 * ���ϰ�)�ִ밪
 * 3.min()
 * ��� ) ���ڷ� ���� ������ 2�� �߿��� �ּҰ��� ���Ѵ�
 * ���ϰ�) �ּҰ�
 * �������� ����ϸ� �������� ���� ������ �� �ִ�.
 */
package method11_23Mon;
import java.util.Scanner;
public class test_method03_min_max2_solve02 {
	public static void main(String[]args) {

	int [] data = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("���� 5���� �Է��ϼ���>");
	for(int i = 0 ; i <data.length; i++)
		data[i] = sc.nextInt();
	 
	int[]result = max_min(data);//�޼��� ȣ�� (����) ���
	
	
	System.out.println(" �ִ�:" + result[0]);
	System.out.println(" �ּڰ�:" + result[1]);
	
		 sc.close(); //�����ʱ�
		 
	}
	public static int[] max_min(int data[]) { //���Ǹ� ���� data�� �̸��� �����ɷ� ����
/*		int[] result = new int[2];
//		result[0] = data[0];
//		result[1] = data[0];
	*/	
		int result[] = {data[0], data[0]};
		
		for (int i= 1; i< data.length; i++) {
			if(result[0] < data [i]) result[0] = data[i]; //max
			if(result[1] > data [i]) result[1] = data[i]; //min
		}
		return result;
	
		
		}
	
	}

