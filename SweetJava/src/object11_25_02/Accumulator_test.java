package object11_25_02;


 class Accumulator_test {
	 public static void main(String args[]) {
	int grandTotal = Accumulator.getGrandTotal();
	System.out.println("총계 " + grandTotal);

	Accumulator obj1 = new Accumulator();
	Accumulator obj2 = new Accumulator();
	obj1.accumulate(10);
	obj2.accumulate(20);

	//정적 메서드 호출문
	grandTotal = Accumulator.getGrandTotal();
//	System.out.println("obj1.total = " + obj1.total);
//	System.out.println("obj1.grandTotal = " + obj2.total);
	//인스턴스(인스턴스가 되어야 사용할수있는 변수 = new하라는 이야기) 메서드 print()를 정적 메서드인 main()에서 호출할 수없다.
	Accumulator_test s =new Accumulator_test();
	s.print(obj1);//스테이틱이 아닌 변수가 올수있다. 대신 이곳 패키지 이름가져와서 위처럼 new해줘함 print(obj1); 에서 s.print(obj1)로 바뀜
	s.print(obj2);//이 메서드를 사용하기 위한 방법은?//
	System.out.println("총계=" +grandTotal);
	
	 }
	 void print(Accumulator a) { //
		 System.out.println("total =" + a.total);
	 }
	 
	 
}
