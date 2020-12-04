package object_Numbers_array11_24;

public class Numbers2 {
	private int num[];

		Numbers2(int num[]){
		this.num = num;
		}
		
		int getTotal() {//합구하는 메서드
			int total = 0;
			/*for(int cnt = 0;cnt <num.length; cnt++)
			 * total += num[cnt];
			 */
			for(int n:num) {
				total += n;
			}
			return total;
		}
		
		int getAverage() { //평균구하는 메서드
			return getTotal()/ num.length;
			//getTotal값을 length로 나눈값
		}
//		public void setNumbers(int num) {
//		 this.setNumbers= Numbers;
//		}
//		public int getNumbers() {
//			return Numbers; 
//		}
}


