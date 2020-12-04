/*
 * StringBuffer 멀티쓰레드에 안전하도록 동기화 되어있따.
 * 동기화란 공유 데이터 사용 중에 그 공유 데이터를 다른 스레드가 사용하지 못하도록
 * 만드는 것을 의미한다.
 * 멀티 쓰레드로 작성된 프로그램이 아닌 경으 stringbuffer의 동기화는 부류ㅣㄹ요하게 성능만 떨어뜨리게 되어 stringbuffer에서 쓰레드의 
 * 동기화만 뺀 stringbuilder가 추가 되었습니다.
 * stringbuilder는  stringbuffer와 똑같은 기능으로 작성되어 있다.
 * 
 * 1. 문자열 값을 수정할 수 있는mutavle(가변)dlqslek.
 * 2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬수 있다.
 * 
 * synchronized 공유한 것에 락 걸어주는것
 */
package String11_27_08;

class StringBufferEx2 {

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("동해물과 백두산이 마르고  ");
		// 기존 문자열에 추가함
		System.out.println(sb.append("닳도록 보우하사"));

		// index가 19인 곳에 "하느님이 하느님이"를 삽입
		System.out.println(sb.insert(19, "하느님이 하느님이"));
		// index 가 25부터 27까지 문자열 삭제
		System.out.println(sb.delete(24, 28));
		// index 가 9 인 곳의 문자 하나 삭제
		System.out.println(sb.deleteCharAt(9));

	}

}
