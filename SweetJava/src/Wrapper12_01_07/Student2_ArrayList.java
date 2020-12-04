package Wrapper12_01_07;

import java.util.ArrayList;

public class Student2_ArrayList {

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
	
	public Student2_ArrayList(String name, int kor, int eng, int math, int no) {
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
		Student2_ArrayList.mathTotal = mathTotal;
	}


//�л��� ������ �������� �����ϱ�
	public static void sort(ArrayList<Student2_ArrayList> hs) {
		Student2_ArrayList imsi;
		for (int i = 0; i < hs.size() - 1; i++) {
			for (int j = 0; j < hs.size() - 1 - i; j++) {
				if (hs.get(j).total < hs.get(j+1).total) {
					imsi = hs.get(j);
					hs.set(j, hs.get(j+1));
					hs.set(j+1, imsi);
				}
			}
		}
	}

	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t"
				+ String.format("%.1f",String.format / 3f);
	}
}
