package String11_27_08;

public class StringEx_sevral_things01 {
public static void main(String args[]) {
	String str1 = "   Let it be.   ";
	String str2 = str1.trim();
	System.out.println("===  trim() : ���ڿ� �յ� ��������   ===");
	 System.out.println(str1);
	 System.out.println(str2);
	 System.out.println("���ڿ� ���� =" + str2.length() + "\n");
	 
	 System.out.println("===concat() : ���ڿ� ���� ===");
	 System.out.println(str2.concat(" Speaking words of wisdom"));
	 System.out.println(str2 + "\n");
	 
	 System.out.println("===toUpperCase() : �빮�ڷ� ��ȯ ===");
	 System.out.println(str2.toUpperCase());
	 System.out.println(str2 + "\n");

	 System.out.println("===toLowerCase() : �ҹ��ڷ� ��ȯ ===");
	 System.out.println(str2.toLowerCase());
	 System.out.println(str2 + "\n");
	 
	 System.out.println("===concat() : ���ο� ���ڷ� ��κ��� ===");
	 System.out.println(str2.replace('e','a'));
	 System.out.println(str2 + "\n");
	 
	 System.out.println("=============toString() ==========");
	 System.out.println(str1.toString());
	 System.out.println(str2.toString()+ "\n");
}
}


