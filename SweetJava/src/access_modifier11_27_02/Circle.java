package access_modifier11_27_02;
//only public, abstract & final are permitted
protected class Circle {// Illegal modifier for the class Circle_private; only public, abstract & final
								// are permitted -private사용불가
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	double getArea(){
	 return radius * radius * 3.14;
	
}
//double radius;여기로 옮겨도 됨
}

//반지름 5 원의 넓이