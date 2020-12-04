package Array;

public class test_array04 {
	public static void main(String args[]) {
		int[] data = { 20, 30, 40, 80, 10 };

		int max = data[0];
		int min = data[0];

//	 max = (data[0] > data [1]) ? data[0] : data[1];
//	 max = (data[1] > data [2]) ? data[1] : data[2];
//	 max = (data[2] > data [3]) ? data[2] : data[3];
//	 max = (data[3] > data [4])
//	 
		for (int i = 1; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
			if (min > data[i])
				min = data[i];

		}
		/*
		 * for (int i = 1 ; i < data.length; i ++) { max = ( max > data[i] ? max:
		 * data[i]; min = (min < data[i]) ? min :
		 */
		for (int i = 1; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
			if (min > data[i])
				min = data[i];

		}
	}
}
