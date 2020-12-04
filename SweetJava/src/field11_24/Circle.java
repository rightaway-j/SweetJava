package field11_24;

public class Circle {
	double radius;
	
	
Circle(double radius){
	this.radius = radius;
}

double getArea(){
	double area = radius * radius * 3.14;
	return area;
}
//double radius;여기로 옮겨도 됨
}

//반지름 5 원의 넓이