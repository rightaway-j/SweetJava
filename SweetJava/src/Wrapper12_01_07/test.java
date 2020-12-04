package Wrapper12_01_07;

public class test {
	public static void main(String[] args) {
		int max = max(args);
		int min= min(args);

		System.out.println("최대값은=" + max);
		System.out.println("최소값은="+ min);

	}

	private static int max(String[] args) {
		int max = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			for(int j = 1; j < cnt; j++)
			if (Integer.parseInt(args[cnt]) >= Integer.parseInt(args[j])) {
				max = Integer.parseInt(args[cnt]);
			}else 
				max = Integer.parseInt(args[j]);
		}
		return max;
	}
	private static int min(String[] args) {
		int min = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			for(int j = 1; j < cnt; j++)
			if (Integer.parseInt(args[cnt]) <= Integer.parseInt(args[j])) {
				min = Integer.parseInt(args[cnt]);
			}else 
				min = Integer.parseInt(args[j]);
		}
		return min;
	}
	
}
