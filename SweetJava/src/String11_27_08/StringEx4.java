package String11_27_08;
import java.util.Scanner;
public class StringEx4 {
	public static void main(String args[]){
		//파일명을 입력받아 확장자 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요>");
		
		//String filename = sc.next();
		String filename = sc.nextLine();//공백다 가져감 enter치기 전까지\
		
		int index = filename.lastIndexOf("."); //.뒤를 가져오는 메서드
		if(index == -1) {
			System.out.println("파일명을 정확하게 입력하세요.");
			
		}else {
			String result = filename.substring(index +1);
			System.out.println(result);
		}
		sc.close();
		
	}
	
}
