package Array;

import java.util.Scanner;

public class test_array_string02 {
	public static void main(String args[]) {
	 String names[] = { "홍길동", "이순신", "홍길동 ", "세종대왕", "김길동"};
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("검색할 이름을 입력하세요>");
	 String name = sc.next();
	 System.out.println("이름::" + name);
	 if(name.equals(names)) {
		 System.out.println(name + "은 배열의" + "방에서 찾았습니다."); 
	 }
	 
	 
//	 else(name.equals(names)){
//		 System.out.println(name + "은 배열에서 찾지 못했습니다.");
//	 }

//	 for (int i = 0; i < name.length; i++) {
//		 
//		 System.out.println(name[i]);
	 sc.close();
		}
}
