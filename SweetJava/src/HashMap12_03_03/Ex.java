package HashMap12_03_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex {
 static Map<String, Integer> max_min(int[] data) { // ���Ǹ� ���� data�� �̸��� �����ɷ� ����
	Map<String, Integer> m = new  HashMap<String, Integer>();
	
		int result[] = {data[0], data[0]};//
		

		for (int i = 1; i < data.length; i++) {
			if (result[0] < data[i])
				result[0] = data[i]; // max
			if (result[1] > data[i])
				result[1] = data[i]; // min
		}
		m.put("�ִ밪", result[0]);
		m.put("�ּҰ�", result[1]);
		return m;
	}

	public static void main(String[] args) { 

		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���>");
		for (int i = 0; i < data.length; i++)
			data[i] = sc.nextInt();

		Map<String, Integer>m = max_min(data);// �޼��� ȣ�� (����) ���

		System.out.println(" �ִ�:" + m.get("�ִ밪"));
		System.out.println(" �ּڰ�:" + m.get("�ּҰ�"));

		sc.close(); // �����ʱ�

	}

}
