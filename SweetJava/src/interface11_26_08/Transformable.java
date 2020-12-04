package interface11_26_08;

abstract interface Transformable extends Movable {//실선 일경우에는 같은 관계에있으므로  extends를 써야함
	void resize(int width, int height); //크기 조정
}
