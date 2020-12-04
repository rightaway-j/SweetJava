package object11_25_01;

public class Accumulate_main {
public static void main(String args[]) {
	System.out.println("정적변수grandTotal = "+ Accumulator.grandTotal);

	Accumulator obj1 = new Accumulator();
	Accumulator obj2 = new Accumulator();
	obj1.accumulate(10);
	System.out.println("obj1.total = " + obj1.total);
	System.out.println(" obj1.grandTotal = " + obj1.grandTotal);
	System.out.println("Accumulater.grandTotal=" + Accumulator.grandTotal);
	
	obj2.accumulate(20);
	System.out.println("=================================================================");
	System.out.println("obj1.total = " + obj2.total);
	System.out.println(" obj1.grandTotal = " + obj2.grandTotal);
	System.out.println("Accumulater.grandTotal=" + Accumulator.grandTotal);
	
	
	
	
}
}
