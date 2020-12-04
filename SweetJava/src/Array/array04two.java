package Array;

public class array04two {
public static void main(String args[]) {
	int table[][] = new int[3][4];//3青4凯狼 农扁肺 积己
	
	table[0][0] = 10;
	table[1][1] = 20;
	table[2][3] = table[0][0] + table[1][1];
	
	System.out.println(table[0][0]);
	System.out.println(table[1][1]);
	System.out.println(table[2][3]);
	//System.out.println("table[3][4] = " + table[3][4]);
	
	for(int i =0 ; i <table.length; i++) {
		for(int n =0 ; n <table[i].length; n++) 
			System.out.println("table[" + i +"][" + n +"] = " + table[i][n]);
	}
	} 
	
	
}

