package method11_23Mon;

public class method05 {
	public static void main(String[] args) {
		sum(10);//메서드 호출(메서드 실행), 10:인자
		sum(100);
		sum(1000);
		return;//(생략 가능)
//		int sum=0;
//		for (int i=1; i<=10; i++)
//			sum += i;
//		System.out.println("합(1~10:)" + sum);
//		
//		sum=0;
//		for (int i=1; i<=100; i++)
//			sum += i;
//		System.out.println("합(1~100):" + sum);
//		
//		sum=0;
//		for (int i=1; i<=1000; i++)
//			sum += i;
//		System.out.println("합(1~1000):" + sum);
	}
	
	public static void sum(int end) { //main 에 있던 구현을 sum에 저장, -반복 되기 때문에, 변하는 숫자 i<=10이부분을 end로 변경후 main에서 구현함 
		int sum=0;
		for (int i=1; i<=end; i++)
			sum += i;
		System.out.println("합(1~" + end + "):" + sum);
		
		return; //여기서는 필수,돌아가야지 다음 문 구현가능하기 때문
	}
	
}
