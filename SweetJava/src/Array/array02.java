package Array;

public class array02 {
 public static void main (String args[]) {
	 int[] arr;
	 arr = new int[10];
	 int n = 0; //n 변수 사용할때 초기값 지정해주고 n을 돌릴려면 for문으로 처리
	 for (;n < 10; n++) {
	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
	 //("arr[" + n +"]=" + arr[0]);로 사용한다
	 }
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
//	 System.out.println("arr"+ "[" + n +"]" + "=" +arr[0]);
	 
//	 arr[0] = 0;
//	 arr[1] = 0;
//	 arr[2] = 0;
//	 arr[3] = 0;
//	 arr[4] = 0;
//	 arr[5] = 0;
//	 arr[6] = 0;
//	 arr[7] = 0;
//	 arr[8] = 0;
//	 arr[9] = 0;
	 System.out.println("============arr.length사용======================");
	 //arr.length : 배열의 크기
	  for(int i = 0; i < arr.length; i++)
		  System.out.println("arr[" + i +"]=" + arr[0]);
	  
 }
}
