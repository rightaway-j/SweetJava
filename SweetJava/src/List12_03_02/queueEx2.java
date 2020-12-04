package List12_03_02;

import java.util.*;
import java.util.Queue;

/*
 *큐(Queue)인터페이스
 *- LinkedList(Queue인터페이스를 구현한 클래스)를사용
 *-FIFO(First Input First Output)구조
 *먼저 입력된 자료가 먼저 출력되는 구조
 */
public class queueEx2 {
	 public static void main(String args[]) {
		 //큐로 사용할 LinkedList객체를 생성한다.
		 // LinkedList<Strin> queue = new LinkedList<String>();
		 Queue<String>queue = new LinkedList<String>();
		 System.out.println("비었나요?"+ queue.isEmpty());//true-비었는지 판단
		 
		 //offe()메소드 : 큐에 3개의 데이터를 추가
		 queue.offer("rabbit");
		 queue.offer("deer");
		 queue.offer("lion");
		 
		 //peek() 메소드: 처음 데이터를 그대로 둔 상태로 가져온다.
		 System.out.println(queue.peek());
		 System.out.println("비었나요?"+queue.isEmpty());//false-비었는지 판단
		 System.out.println("갯수=" + queue.size());
		 
		 System.out.println("poll()사용");
		 while(!queue.isEmpty()) {
			 //poll()메소드는 쿠에 있는 데이터를 제거하면서 가져온다
			 String str= queue.poll();
			 System.out.
			 
			 println(str);
		 }
		 System.out.println("비었나요?"+ queue.isEmpty());//true비었는지 판단
	 }//스택에 넣었으면 넣은순서 반대로 출력됨

}
