package exception_try_chatch12_01_01;

public class InvalidInputException_main {
	public static void main(String arg[]) {
		try{
			int result = subtract(5,100);
			System.out.println(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static int subtract(int a, int b)throws InvalidInputException{
		if (a<b)
			throw new InvalidInputException();
		return a - b;
	}
}
