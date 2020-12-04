package Array;

public class array05_upgrade_for {
	public static void main(String args[]) {
		String name[] = {"홍길동","이순신","세종대왕"};
		
		
		//향상된 for문, 확장for문 (jdk1.5이상)
		for (String na : name) {
			System.out.println(na);
		}
		//기존 for문
		for(int i= 0; i<name.length; i++)
		System.out.println(name[i]);
		
	}
	
}
