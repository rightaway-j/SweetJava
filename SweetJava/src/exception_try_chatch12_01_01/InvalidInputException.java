package exception_try_chatch12_01_01;
//����� ���� Exception Ŭ������ ���� ��
public class InvalidInputException extends Exception {
	InvalidInputException(){
		//���� Ŭ������ �����ڸ� ȣ���Ͽ� ���� �޽����� �����Ѵ�.
		super("�߸� �� �Է��Դϴ�."); //����� ������ �θ��� �͵��� �����;� �ϹǷ� �̷��� �ۼ�
	} 
	
}
