package interface11_26_05.copy;

abstract class Dictionary implements Lendable {
	String title;
	Dictionary(String title){
		this.title = title;
		
	}
//	public void checkOut(String borrower)

//}
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}
}
