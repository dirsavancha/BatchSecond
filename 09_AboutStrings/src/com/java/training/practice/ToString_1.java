//

package com.java.training.practice;

class CustomerProduct{
	
	float p_Price;
	String name,p_Name;
	
	CustomerProduct(String name,String p_Name,float p_Price){
		this.name=name;
		this.p_Name=p_Name;
		this.p_Price=p_Price;
	}
	
		
	
	
	
	public String toString() {
		
		return "Customer Name "+name+" "+"Prd Name"+p_Name+" "+"Prd Price"+p_Price;
	}
	
}
public class ToString_1{
	public static void main(String...abc){
		CustomerProduct c1=new CustomerProduct("Ram","Television",3000.0f);
		System.out.println(c1);
		
	}
}