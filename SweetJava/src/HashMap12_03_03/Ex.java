package HashMap12_03_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex {
 static Map<String, Integer> max_min(int[] data) { // 편의를 위해 data의 이름을 같은걸로 해줌
	Map<String, Integer> m = new  HashMap<String, Integer>();
	
		int result[] = {data[0], data[0]};//
		

		for (int i = 1; i < data.length; i++) {
			if (result[0] < data[i])
				result[0] = data[i]; // max
			if (result[1] > data[i])
				result[1] = data[i]; // min
		}
		m.put("최대값", result[0]);
		m.put("최소값", result[1]);
		return m;
	}

	public static void main(String[] args) { 

		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요>");
		for (int i = 0; i < data.length; i++)
			data[i] = sc.nextInt();

		Map<String, Integer>m = max_min(data);// 메서드 호출 (실행) 얘랑

		System.out.println(" 최댓값:" + m.get("최대값"));
		System.out.println(" 최솟값:" + m.get("최소값"));

		sc.close(); // 잊지않기

	}

}
