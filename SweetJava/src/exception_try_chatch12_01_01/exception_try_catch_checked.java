//checked exception�� �ش�- ������ ���� �߻�
//�ذ�å: try ~chtch  ������ ó�� �Ǵ� �޼��� ������ ����
package exception_try_chatch12_01_01;

public class exception_try_catch_checked {
	public static void main(String args[]) {
		int sum = 1 + -2;				//���� ������ �ʵ忡,  try,catch�� �� ������ �Ŵϱ�
		try {
			if (sum < 0)
				throw new Exception("���� �߻�");//throw �ʼ� �ۼ� ()��ȣ �ȿ� ��찡 true�ϰ�� thow�ض�
			System.out.println(sum); //if ���� false�ΰ��� if�� ����� sum�� ����϶�
		} catch (Exception e) {
			String str = e.getMessage();	//	e.getMessage�� �ϴ� ����?	
			System.out.println(str);
		}
	}

}
