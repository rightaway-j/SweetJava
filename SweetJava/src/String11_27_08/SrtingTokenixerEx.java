package String11_27_08;
import java.util.StringTokenizer;
public class SrtingTokenixerEx {
	public static void main(String args[]) {
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");
		
//		String s1 = stok.nextToken();
//		System.out.println(s1);
//		
//		String s2 = stok.nextToken();
//		System.out.println(s2);
//		
//		String s3 = stok.nextToken();
//		System.out.println(s3);
//		
//		//런타임 에러 발생 = 추출할 토큰이 더이상 없음
//		String s4 = stok.nextToken();
//		System.out.println(s4);
		while(stok.hasMoreTokens()) {
			System.out.println(stok.nextToken());
		}
		
		
	}

}
