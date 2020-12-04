package student_array_to_object;
import java.util.Arrays;
public class Student_test5 {
	public static void main(String args[]) {

		Student h1 = new Student("강호동", 85, 60, 70);
		Student h2 = new Student("이승기", 90, 95, 80);
		Student h3 = new Student("유재석", 75, 80, 100);
		Student h4 = new Student("하하", 80, 70, 95);
		Student h5 = new Student("이광수", 100, 65, 80);
		System.out.println("================학생별/과목별 총점 구하기===============");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		Student[] students={h1,h2,h3,h4,h5};
		printInfo(students);
		
		int Total[] = new int[3];
//		Total[0] = h1.kor + h2.kor + h3.kor + h4.kor + h5.kor;
//		Total[1] = h1.eng + h2.eng + h3.eng + h4.eng + h5.eng;
//		Total[2] = h1.math + h2.math + h3.math + h4.math + h5.math;
		for (int i=0; i<students.length;i++) {
			Total[0] += students[i].kor;
			Total[1] += students[i].eng;
			Total[2] += students[i].math;
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}
		
		System.out.print("\n총점\t");
		for (int i = 0; i < Total.length; i++)
			System.out.print(Total[i] + "\t");

	}
//	static void printInfo(Student obj) {
//		System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math + "\t" + obj.getTotal()+"\t");
//		System.out.printf("%.1f\n", obj.getAverage());//이거에서 아래로 바뀜
//	}
	static void printInfo(Student[] objs) {
		for (Student obj : objs) {
			System.out
					.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t");
			System.out.printf("%.1f\n", obj.getAverage());
		}
	}
}
