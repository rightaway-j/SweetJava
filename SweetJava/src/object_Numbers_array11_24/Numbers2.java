package object_Numbers_array11_24;

public class Numbers2 {
	private int num[];

		Numbers2(int num[]){
		this.num = num;
		}
		
		int getTotal() {//�ձ��ϴ� �޼���
			int total = 0;
			/*for(int cnt = 0;cnt <num.length; cnt++)
			 * total += num[cnt];
			 */
			for(int n:num) {
				total += n;
			}
			return total;
		}
		
		int getAverage() { //��ձ��ϴ� �޼���
			return getTotal()/ num.length;
			//getTotal���� length�� ������
		}
//		public void setNumbers(int num) {
//		 this.setNumbers= Numbers;
//		}
//		public int getNumbers() {
//			return Numbers; 
//		}
}


