package object11_25_02;

public class Student {
	String name;
	int kor, eng, math;
	static int korTotal;
	static int mathTotal;
	static int engTotal;
	
	Student(String name,int kor, int eng, int math ){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		korTotal+=kor;
		mathTotal+=eng;
		engTotal+=math;
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return(getTotal()/ 3f);
		
	}
	
	

	
	
}
