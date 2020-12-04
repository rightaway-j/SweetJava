package geometry_main11_27_07;
import geometry_common11_26_05.*;
import geometry_shape11_26_06.Square;
public class main2 {
	public static void main(String args[]) {
		//다른 패키지에서protected생성자 접근 불가하다.
		Square s = new Square(100, 200, 15);//부모 자식 관계가아니기에 사용불가
		
		int x,y;
		//for(int i = 0; i < 4; i ++){
		for (int i =0 ; i< s.x.length; i++) {
			x = s.getX(i);
			y = s.getY(i);
			System.out.print("x[" + i +"]=" + x + "\t");
			System.out.print("y[" + i +"]=" + y + "\n");
		}
//		System.out.println("X[0]="+ obj.getX(0)  +","+"Y[0]=" + obj.getY(0));
//		System.out.println("X[1]="+ obj.getX(1) +","+"Y[1]=" + obj.getY(1)  );
//		System.out.println("X[2]="+ obj.getX(2)  +","+"Y[2]=" +  obj.getY(2) );
//		System.out.println("X[3]="+  obj.getX(3) +","+"Y[3]=" +  obj.getY(3) );
			for (int i =0 ; i< 4; i++) {
				x = s.getX(i);
				y = s.getY(i);
				System.out.print("(" + x +",");
				System.out.print(y	+ ")" + "\n");
			}
			
//		System.out.println("("+obj.getX(0)+ ","+ +obj.getY(0)+")");
//		System.out.println("("+obj.getX(1)+ ","+ +obj.getY(1)+")");
//		System.out.println("("+obj.getX(2)+ ","+ +obj.getY(2)+")");
//		System.out.println("("+obj.getX(3)+ ","+ +obj.getY(3)+")");
		}
	}

/*
main()메서드

 Square obj = new Square(100, 200, 15); //사각형 길이

 위 객체를 생성한 뒤 다음과 같이 출력되도록 main()메서드를 완성하세요.
 X[0]=100,Y[0]= 200
 X[1]=115,Y[1]= 200
 X[2]=115,Y[2]= 215
 X[3]=100,Y[3]= 215
 (100, 200)
 (115, 200)
 (115, 215)
 (100, 215)
*/