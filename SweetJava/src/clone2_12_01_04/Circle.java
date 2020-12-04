package clone2_12_01_04;

//implements 자동완성 = im + ctrl + space bar
public class Circle implements Cloneable {
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle clone() {// 변경된 곳:Object형 =>Rectangle형으로 변경
		try {
			// 슈퍼 클래스의 clone메소드를 호출해서 그결과를 리턴
			return (Circle) super.clone();// 변경된 곳: Rectangle형으로 변환
		}
		// 슈퍼 클래스의 clone메소드가 발생하는 익셉션을 처리
		catch (CloneNotSupportedException e) {
			return null;
		}

	}

	public String toString() {
		return "[p="+p+", r=" + r+ "]"; //p는 참조형 이다.+안됨 옆에 .toString(생략)
				
	}

}
