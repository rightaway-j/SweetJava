package deepcopy12_01_05;

//implements 자동완성 = im + ctrl + space bar
public class Circle implements Cloneable {
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
//깊은 복사 - 원본이 참조하고 있는 객체까지 복제
	public Circle clone() {
	Object obj= null;
		try {
			obj = super.clone();//조상의 clone()을 호출
		}
		
		catch (CloneNotSupportedException e) {
			System.out.println("복사중 오류 입니다.");
			return null; //null이 반환되면 아래 는 재생 안됨
		}
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;

		

	}

	public String toString() {
		return "[p="+p+", r=" + r+ "]"; //p는 참조형 이다.+안됨 옆에 .toString(생략)
				
	}

}
