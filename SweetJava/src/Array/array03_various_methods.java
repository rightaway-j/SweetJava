package Array;

public class array03_various_methods {
	public static void main(String args[]) {
		
		System.out.println("========method 1==========");
		
		int arr[];//�迭 ����
		arr = new int[5];//�迭 ����
		//�迭 ���
		arr[0]= 10;arr[1]= 20;arr[2]= 30;arr[3]= 40;arr[4]= 50;
		
		//�迭 ���
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========method 2==========");
		
		int arr2[] = new int[5]; //�������� 2�� ����
		arr2[0]=10;arr2[1]=20;arr2[2]=30;arr2[3]=40;arr2[4]=50;
		
		for(int i=0; i<arr2.length; i++) 
			System.out.println("arr["+ i +"]" + " =" + arr2[i]);
		
		System.out.println("========method 3==========");
			int arr3[] = {10,20,30,40,50};
			for ( int i = 0; i < arr3.length; i ++)
				System.out.println("arr3["+ i +"]" + " =" + arr3[i]);
		
	}
}
