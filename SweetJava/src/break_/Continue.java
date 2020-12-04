package break_;

public class Continue {
public static void main(String args[]) {
//	for(int n=1; n <=9; n++) {
//		if( n == 4);
//		break;
//		System.out.println(n);
//	}
	//5는 출력하지 않는다
	for (int cnt =0; cnt <10; cnt++) {
		if (cnt != 5)
			System.out.println(cnt);
	}
	System.out.println("=====================");
	for (int cnt =0 ; cnt < 10; cnt++) {
		if (cnt == 5)
			continue;
		System.out.println(cnt);
	
	}
	System.out.println("End");
	
	System.out.println("=======continue사용의 잘못 된 예");
	int cnt = 0;
	while (cnt <10 ) { //여기서 부터  //
		if (cnt == 5)
			continue; //여기까지 계속 5로돌고 있는 중 , continue 무한 루프에 걸려서 다음 6으로 실행이 안됨
		
		System.out.println(cnt);
		cnt++;//이 아이의 실행이 위에 걸려서 안됨 
		
	}
	System.out.println("Done.");
}
}
