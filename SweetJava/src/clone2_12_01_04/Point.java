package clone2_12_01_04;

public class Point {
	int x,y; //���� ����ų ����
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){  				//���������� public �޼��� �̸�:toString() �Ű����� ���� ��ȯ�� String  
		return "(" + x + ","+y+")";	//��� "(" + x + ","+y+")" ���ڿ��� ���� �����Ѵ�.
		
	}

}