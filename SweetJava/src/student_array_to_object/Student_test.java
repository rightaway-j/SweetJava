package student_array_to_object;

public class Student_test {
	public static void main(String args[]) {
	
		Student h1 = new Student("��ȣ��", 85,60,70);
		Student h2 = new Student("�̽±�", 90, 95, 80);
		Student h3 = new Student("���缮", 75, 80, 100);
		Student h4 = new Student("����", 80, 70, 95);
		Student h5 = new Student("�̱���", 100, 65, 80);
	System.out.println("================�л���/���� ���� ���ϱ�===============");
	System.out.println("�̸�\t����\t����\t����\t����\t���");
	
	System.out.print(h1.name + "\t" + h1.kor + "\t" + h1.eng + "\t" + h1.math + "\t" + h2.getTotal()+"\t");
	System.out.printf("%.1f\n", h1.getAverage());
	
	System.out.print(h2.name + "\t" + h2.kor + "\t" + h2.eng + "\t" + h2.math + "\t" + h2.getTotal()+"\t");
	System.out.printf("%.1f\n", h2.getAverage());
	
	System.out.print(h3.name + "\t" + h3.kor + "\t" + h3.eng + "\t" + h3.math + "\t" + h3.getTotal()+"\t");
	System.out.printf("%.1f\n", h3.getAverage());
	
	System.out.print(h4.name + "\t" + h4.kor + "\t" + h4.eng + "\t" + h4.math + "\t" + h4.getTotal()+"\t");
	System.out.printf("%.1f\n", h4.getAverage());
	
	System.out.print(h5.name + "\t" + h5.kor + "\t" + h5.eng + "\t" + h5.math + "\t" + h5.getTotal()+"\t");
	System.out.printf("%.1f\n", h5.getAverage());
	
	int Total[] = new int[3];
	Total[0] = h1.kor + h2.kor + h3.kor + h4.kor + h5.kor; 
	Total[1] = h1.eng + h2.eng + h3.eng + h4.eng  + h5.eng; 
			Total[2] = h1.math + h2.math + h3.math + h4.math + h5.math; 
			for(int j=0; j<45; j++) {
				System.out.print("=");
			}
			
			System.out.print("\n����\t");
			for(int i= 0; i<Total.length; i++)
				System.out.print(Total[i]+"\t");
			System.out.println();
			for(int j=0; j<45; j++) {
				System.out.print("=");
			}

			
	
	}



	
	
}
