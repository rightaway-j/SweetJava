package interface11_26_08;

public class interfaceEx {
	public static void main(String args[]) {
        Rectangle obj = new Rectangle(100, 200, 10, 10); 
        printRectangle(obj);
        
        obj.moveTo(25, 35);            
        printRectangle(obj);
        
        obj.moveBy(-5, -5);           
        printRectangle(obj);
        
        obj.resize(30, 30);           
        printRectangle(obj);
    }

	 static void printRectangle(Rectangle obj) {
		// TODO Auto-generated method stub
		 System.out.printf("�簢��: ��ġ(%3d,%3d) ũ�� (%3d x %3d) %n", obj.x, obj.y, obj.width, obj.height);
		
	}
}
