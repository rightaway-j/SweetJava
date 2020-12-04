package Wrapper12_01_07;

public class Student2 {

	private int no; //누구와고도 중복되지않고, 개인의 고유번호,
	private String name;
	private int kor, eng, math;
	private int total;
	public static int korTotal;
	public static int engTotal;
	public static int mathTotal;
	
	public int getNo() { //set 번호를 수정할 필요없어서 사용 안함
		return no;
	}
	
	public void setName(String name) {
		this.name = name; //수정할때 국어, 영어, 수학수정을 위함
	}
	
	public int getKor() { //가져올 국어 점수
		return kor;
	}
	
	public void setKor(int kor) {
		total += kor- this.kor; //값이 변경되면 총 토탈에 추가 될 수 있도록
		korTotal += kor- this.kor;
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		total += eng- this.eng; //값이 변경되면 총 토탈에 추가 될 수 있도록
		korTotal += eng- this.eng;
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		total += math- this.math; //값이 변경되면 총 토탈에 추가 될 수 있도록
		korTotal += math- this.math;
		this.math = math;
	}
	
	public Student2(String name, int kor, int eng, int math, int no) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.no=no;		
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;
	}


	public static void setMathTotal(int mathTotal) {
		Student2.mathTotal = mathTotal;
	}



	public static void sort(Student2[] hs) {
		Student2 imsi;
		for (int i = 0; i < hs.length - 1; i++) {
			for (int j = 0; j < hs.length - 1 - i; j++) {
				if (hs[j].total < hs[j + 1].total) {
					imsi = hs[j];
					hs[j] = hs[j + 1];
					hs[j + 1] = imsi;
				}
			}
		}
	}

	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t"
				+ String.format("%.1f",String.format / 3f);
	}
}
