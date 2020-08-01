
// hashcode
package com.java.training.practice;
class HashCodeDemo{
	
	String s1="chennai";
	String s2="chennai";
	String s3="hyderabad";
	String s4="FB";
	String s5="ea";
	
	void show(){
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		
	}
}
contract between hashcode and equals ().
1.if you override hashcode(), compulsory you want override equals() also.
2.if hascode  of two objects are similar then we cant conform equal() also true
  eg:
  123
  123
  .equals()---false
3.If equals method given as true--- compulsor hashcode for two objects will be similar

equals()--true
has 1--1011
has 2--1011



public class HashCode_1{
	public static void main(String...abc){
		HashCodeDemo hcd=new HashCodeDemo();
		hcd.show();
	}
}

