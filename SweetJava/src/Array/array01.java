package Array;
//변수명사용의 단순화, java는 0부터 시작한다 element와 index가 만나 배열을 이룸 /배열은 참조형(실제값의 주소)
public class array01 { // class로부터 객채를 생성한다 sc. scanner = new scanner 여기서 new
	public static void main(String args[]) { //[] 메인 메소드에 사용하는 괄호
		int arr[]; // 배열 변수를 선언
		arr = new int[10]; //배열 생성, 배열의 크기 10개 생성
		
		//배열 사용
		arr[0] = 10;//
		arr[1] = 20;
		arr[2] = arr[0]+ arr [1];
		System.out.println("dd");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[9]);
		System.out.println(arr[8]);
		//System.out.println(arr[10]); //오류 발생java.lang.ArrayIndex OutOfBounds Exception
	}
}
