package student_array_to_object;

import java.util.Arrays;

public class Student_test4 {
	public static void main(String args[]) {

		Student h1 = new Student("��ȣ��", 85, 60, 70);
		Student h2 = new Student("�̽±�", 90, 95, 80);
		Student h3 = new Student("���缮", 75, 80, 100);
		Student h4 = new Student("����", 80, 70, 95);
		Student h5 = new Student("�̱���", 100, 65, 80);
		System.out.println("================�л���/���� ���� ���ϱ�===============");
		System.out.println("�̸�\t����\t����\t����\t����\t���");

		Student[] students = { h1, h2, h3, h4, h5 };
		selectionsort(students);
		printInfo(students);
		int Total[] = new int[3];
//		Total[0] = h1.kor + h2.kor + h3.kor + h4.kor + h5.kor;
//		Total[1] = h1.eng + h2.eng + h3.eng + h4.eng + h5.eng;
//		Total[2] = h1.math + h2.math + h3.math + h4.math + h5.math;
		for (int i = 0; i < students.length; i++) {
			Total[0] += students[i].kor;
			Total[1] += students[i].eng;
			Total[2] += students[i].math;
		}
		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.print("\n����\t");
		for (int i = 0; i < Total.length; i++)
			System.out.print(Total[i] + "\t");

	}

//	static void printInfo(Student obj) {
//		System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math + "\t" + obj.getTotal()+"\t");
//		System.out.printf("%.1f\n", obj.getAverage());//�̰ſ��� �Ʒ��� �ٲ�
//	}
	static void printInfo(Student[] objs) {

//		Arrays.sort(arr,Collections.reverseOrder());
		// for(int i = 0; i < objs.length; i++)
		for (Student obj : objs) {
			System.out
					.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t");
			System.out.printf("%.1f\n", obj.getAverage());
		}
	}

	static void selectionsort(Student[] sort) {
//		int a[] = { 5, 4, 3, 2, 1 }; //ó���� �ٸ��ڸ����ִ°͵��� ���ؼ� ���� �͵��� ������ ��
		Student imsi; //imsi��� �迭�� ������ ����/ getTotal�� �����̱⿡ ������ ������൵ ��
		System.out.println();
		for (int i = 0; i < sort.length - 1; i++) {//5������ 1������ ����Ǵ� -1
			for (int j = i + 1; j < sort.length; j++) {//0��°�� �����̴� �״��� �ڸ� 1���ͺ��ؾ��Ѵ� i +1 
				
				if (sort[i].getTotal() >= sort[j].getTotal()) {
					 imsi = sort[i];
					sort[i] = sort[j];
					sort[j] = imsi;
				} // if
				for (int k = 0; k < sort.length; k++);
			} // for j
		} // for i
	}
}
