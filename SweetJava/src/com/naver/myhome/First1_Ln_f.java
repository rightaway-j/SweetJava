package com.naver.myhome;
	 /*
	  * 1. System.out.println() : 괄호안의 내용을 출력한 후 한 행을 띄웁니다.
	  * 2. system.out.print() : 괄호안의 내용을 출력한 후 한 행을 띄지 않고 유지합니다.
	  * 3. system.out.printf() : 서식을 지정해서 출력합니다.
	  		형식: System.out.printf( "포맷 명시자", 데이터)
	       	주의점: %로 시작하는 포맷 갯수와 데이터의 갯수가 일치해야 합니다.
	  */
	 // 리터널(literal)- 그 자체로 값을 의미 하는 것
public class First1_Ln_f {
	public static void main(String args[]) {
		System.out.println("출력성공!!");//문자열
		System.out.println(30); // 정수
		System.out.println(3.14); //실수
	    System.out.println('A'); //문자
	    System.out.println(true); //논리(불린)
	    System.out.println(false); 
	    System.out.println("====== println() 끝 ========"); //문자열

	    System.out.print("출력성공!!");//문자열
		System.out.print(30); // 정수
		System.out.print(3.14); //실수
	    System.out.print('A'); //문자
	    System.out.print(true); //논리(불린)
	    System.out.print(false); 
	    System.out.println("====== println() 끝 ========"); //문자열
	    
	    // 실수 42.195를 실수 서식(%f)으로 출력해라
	    // (기본 소수점이하 6자리)
	    System.out.printf("%f", 42.195);
	    System.out.println();//줄 바꾸어라
	    
	    //실수 42.195를 실수 서식 소수점 이하 2자리(%.2f)로 출력해라. 소수점 아래 3자리에서 반올림
	    // \n(%n)은 출력 후 줄 바꾸라는 서식
	    System.out.printf("%.2f%n", 42.195);
	    
	    // 정수 42를 정수 서식(%d)으로 출력해라
	    System.out.printf("%d", 42); //d- 정수 c-캐릭터 char
	    
	    
	   
	    //나이 이름은 홍길동, 나의 나이는 21세 입니다.
	    System.out.printf("\n나의 이름은 %s, 나의 나이는 %d세 입니다.", "홍길동", 21);
	    
	    //문자나언더바_ $달러기호로 반드시 시작
	    	//클래스 이름은 대문자로 시작, 메소드,변수, 배열,문자열은 소문자로 시작
	    //
	    //자료형
	    //-논리1, 문자 char 2 byte 1 short 2, 정수 int 4 long 8, 실수4 double 8 =>기본형
	    //=>참조형(reference Type): 실제 값이 있는 주소 저장소,
	    //이렇게 사용함-클래스, 배열, 인터페이스, 열거형
	    //ex) string s1 = "자바";
	    // String s2 = new String("자바"); 대문자 사용= 클래스
	    
	    
	}

}
