/*
 * StringBuffer ��Ƽ�����忡 �����ϵ��� ����ȭ �Ǿ��ֵ�.
 * ����ȭ�� ���� ������ ��� �߿� �� ���� �����͸� �ٸ� �����尡 ������� ���ϵ���
 * ����� ���� �ǹ��Ѵ�.
 * ��Ƽ ������� �ۼ��� ���α׷��� �ƴ� ���� stringbuffer�� ����ȭ�� �η��Ӥ����ϰ� ���ɸ� ����߸��� �Ǿ� stringbuffer���� �������� 
 * ����ȭ�� �� stringbuilder�� �߰� �Ǿ����ϴ�.
 * stringbuilder��  stringbuffer�� �Ȱ��� ������� �ۼ��Ǿ� �ִ�.
 * 
 * 1. ���ڿ� ���� ������ �� �ִ�mutavle(����)dlqslek.
 * 2. �⺻ 16���� ũ��� ������ ���۸� �̿��ϸ�, ũ�⸦ ������ų�� �ִ�.
 * 
 * synchronized ������ �Ϳ� �� �ɾ��ִ°�
 */
package String11_27_08;

class StringBufferEx2 {

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("���ع��� ��λ��� ������  ");
		// ���� ���ڿ��� �߰���
		System.out.println(sb.append("�⵵�� �����ϻ�"));

		// index�� 19�� ���� "�ϴ����� �ϴ�����"�� ����
		System.out.println(sb.insert(19, "�ϴ����� �ϴ�����"));
		// index �� 25���� 27���� ���ڿ� ����
		System.out.println(sb.delete(24, 28));
		// index �� 9 �� ���� ���� �ϳ� ����
		System.out.println(sb.deleteCharAt(9));

	}

}
