package ArrayCopy12_03_04;

public class Ex {
	public static void main(String args[]) {
		char arr1[] = 
			{ '��','��','��','��','��','��','��','��','��','��','ī','Ÿ','��','��'};
		char arr2[] =
			{'a','b','c','d','e','f','g','h','i','j','k'}; //q�迭 arr1�� ��arr2�� �������̵� �ϴ� ��.
		//System.arraycopy(�����迭, ���� �׸� ���� ��ġ, ���� ��� �迭, ���� ��� �׸� ���� ��ġ, ������ �׸��� �� );
		//arr[10] ~arr1[12]�� ���� arr2[2]~ arr2[4]�� ����
		System.arraycopy(arr1, 10, arr2,2,3);
		
		for (char ch : arr2)
			System.out.print(ch+" ");
		System.out.println();
		System.out.println("===========�����մϴ�.===========");
		char copy[] = new char[arr1.length];
		System.arraycopy(arr1, 0, copy, 0,arr1.length);
		for (char ch : copy)
		System.out.print(ch +" ");
	}
}
