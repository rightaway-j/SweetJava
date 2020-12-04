package conditional_loop;

public class while02 {
 public static void main(String args[]) {
	 //0-9까지 가는 변수를 입력
	 
	 int cnt =0;
	 while(cnt <= 9) { // 증가를 추가하지 않으면 0만 계속 돈다
		 System.out.println(cnt);
		 cnt++;  //증가수 1개씩이니까 cnt = cnt +1 이라는 수를 같은 결과를 가져오는 cnt++로 만들어줌
	 }
 }
 
}
