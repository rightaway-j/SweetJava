package Array;

public class test_array_string {
	public static void main(String args[]) {
		System.out.println("========���1=======");

		String name[] = new String[3];
		name[0] = "ȫ�浿";
		name[1] = "�̼���";
		name[2] = "�������";
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

		}
		System.out.println("========���2=======");
		String name2[] = new String[] { "ȫ�浿", "�̼���", "�������" };
		for (int i = 0; i < name2.length; i++) {
			System.out.println(name2[i]);

		}
		System.out.println("========���3=======");
		String name3[] = { "ȫ�浿", "�̼���", "�������" };
		for (int i = 0; i < name2.length; i++) {
			System.out.println(name3[i]);
		}
	}
}
