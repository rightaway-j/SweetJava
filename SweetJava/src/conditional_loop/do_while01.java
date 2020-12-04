package conditional_loop;

public class do_while01 {
 public static void main(String args[]) {
	 int cnt = 0;
	 do {
		 System.out.println(cnt);
		 cnt++;					// 0 1 9
	 } while (cnt < 10);		//1 2 10
	 System.out.println("End"); // 1< 10 2<10 10<10
 }
}
