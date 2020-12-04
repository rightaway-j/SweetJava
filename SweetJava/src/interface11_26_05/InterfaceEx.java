package interface11_26_05;

public class InterfaceEx {
	public static void main(String args[]) {
		SeparateVolume obj1 = new SeparateVolume("867ㅂ733개", "개미", "베르베르");
		obj1.checkOut("수지", "2020-11-26");
		obj1.checkIn();
		
		AppCDInfo obj2 = new AppCDInfo ("2055-2222", "REDhat Fedora");
		obj2.checkOut("수지","2020-11-22");
		obj2.checkIn();
		
	}

}
