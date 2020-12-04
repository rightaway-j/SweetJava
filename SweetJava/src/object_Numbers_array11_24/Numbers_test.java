package object_Numbers_array11_24;

public class Numbers_test {
	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50};
		
		
		Numbers2 obj = new Numbers2(arr);
		print(obj);
		
		Numbers2 obj2 = new Numbers2(
				new int[] { 10,20,30,40,50,60,70,80,90,100});
		print(obj2);
		
		}
		
		static void print(Numbers2 obj) {
			System.out.println("ÇÕ°è=" + obj.getTotal());
			System.out.println("Æò±Õ= " +obj.getAverage());
	}
}
