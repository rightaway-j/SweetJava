package forName12_01_06;

public class Point {
	int x,y; //점을 가리킬 예정
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){  				//접근제어자 public 메서드 이름:toString() 매개변수 없음 반환형 String  
		return "(" + x + ","+y+")";	//기능 "(" + x + ","+y+")" 문자열로 구해 리턴한다.
		
	}

}
