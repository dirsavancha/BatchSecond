// Two Dimentioanl Array


package com.java.training.practice;

class Prog_5{
	
	static void show(){
		String[][] arr=new String[2][3];
		
		arr[0][0]="Ram";
		arr[0][1]="101";
		arr[0][2]="1000.00";
		arr[1][0]="Hari";
		arr[1][1]="102";
		arr[1][2]="5000.00";
		System.out.println("NAME\tID\tSalary");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
public class Prog_5Test{
	public static void main(String...abc){
		Prog_5.show();
	}
}