package Operator;

public class Oper04_1 {
	 public static void main(String args[]){
		int data=10;
		int pandan = data % 2;
		System.out.println("data%2의 값 " + pandan + "입니다.");
		if(pandan == 0) {
		System.out.println(data + "(은) 짝수");
		}else {
		System.out.println(data + "(은) 홀수");
		}
	 }
}
