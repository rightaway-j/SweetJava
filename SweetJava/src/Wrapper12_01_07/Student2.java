package Wrapper12_01_07;

public class Student2 {

	private int no; //�����Ͱ� �ߺ������ʰ�, ������ ������ȣ,
	private String name;
	private int kor, eng, math;
	private int total;
	public static int korTotal;
	public static int engTotal;
	public static int mathTotal;
	
	public int getNo() { //set ��ȣ�� ������ �ʿ��� ��� ����
		return no;
	}
	
	public void setName(String name) {
		this.name = name; //�����Ҷ� ����, ����, ���м����� ����
	}
	
	public int getKor() { //������ ���� ����
		return kor;
	}
	
	public void setKor(int kor) {
		total += kor- this.kor; //���� ����Ǹ� �� ��Ż�� �߰� �� �� �ֵ���
		korTotal += kor- this.kor;
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		total += eng- this.eng; //���� ����Ǹ� �� ��Ż�� �߰� �� �� �ֵ���
		korTotal += eng- this.eng;
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		total += math- this.math; //���� ����Ǹ� �� ��Ż�� �߰� �� �� �ֵ���
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
