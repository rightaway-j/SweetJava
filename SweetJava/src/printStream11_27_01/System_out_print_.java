package printStream11_27_01;
import java.io.PrintStream;
public class System_out_print_ {
public static void main(String arg[]) {
	//public final class System extends Object: 상속불가
	//생성자 없음 - 객체 생성 할 수 없음
	PrintStream a = System.out;//public static final Prints //System의 PrintStream을 사용하여 out(모니터) 혹은 in(키보드 입력)을 사용 하여 
	//print를 통해 모니터에 출력
	a.println("하하");//printstream에서 제공해주는 println
}
}
