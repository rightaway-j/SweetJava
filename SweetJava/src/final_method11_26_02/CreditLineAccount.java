package final_method11_26_02;
/*
 * ������ �Ű�����: 
 * 
 */
class CreditLineAccount extends Account1 {
int creditline; // ���̳� �ѵ� �ʵ�
CreditLineAccount(String accountNo, String ownerName, int valance, int creditLine){
	super(accountNo, ownerName, valance);
	this.creditline = creditLine;
}
//�޼ҵ� �������̵�= �����Ѵ� ��� �ٽ� ����
// ��Ӱ���,�θ� ũ������ ����ο� ��ġ(���ϰ� Ÿ��,�޼��� �̸�, �Ű����� ���)
//���� �������� ������ ���ų� �о�� �Ѵ�

//
int withdraw(int amount) throws Exception {// �����Ѵ�.//�θ� Ŭ������ �� �޼��忡 final�� �ٿ��� ������ ������ ��. (�̰͸��� �ȵȴٰ� ������ �а�)
	if ((balance + creditline) < amount) {
		throw new Exception("������ �Ұ��� �մϴ�.");
	}
	balance -= amount;
	return amount;
}

}