package Collection12_03_;

/*-�ܶ� ��(short circuit evaluaion)
1. &&������ ��� ù��° �ǿ����ڸ� ���ؼ�  false�ΰ��
�ι�° �ǿ����ڸ� ������ �ʰ� false�� ��ȯ�մϴ�.
2. || ������ ��� ù��° �ǿ����ڸ� ���ؼ�  ture�� ��� �ι�° �ǿ����ڸ� ������ 
�ʰ� true�� ��ȯ�մϴ�.
*/
public class logical02 {
	public static void main(String []args) {
		int a=20, b=20;
		
		if (a>=20 && ++b >= 20) { //a>=20 ���̱⿡ ++b>=20 ������
			System.out.println("��" + b);
		}else {
			System.out.println("����");
		}
		System.out.println(b);
		System.out.println("=============");
		
      a=10; b=20;
		if (a>=20 && ++b >= 20) { //a>=20 �����̱⿡ ++b>=20 ������
			System.out.println("��" + b);
		}else {
			System.out.println("����");
		}
		System.out.println(b);
		
		
	}
}
