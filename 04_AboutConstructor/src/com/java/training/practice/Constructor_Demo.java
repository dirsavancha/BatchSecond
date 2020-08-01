// Constructor Demo
/*
constructor:

 def: Constructor is a special type of method is used to initiliaze non static variables of current class
 
 -- 2.Constructor is used to construct the values at the time  of object creation.
  
 -- 3. constructor is used to create an object (new )
 
 -- constructor will initililize the variables at the time of object creation.
 
 Note In java except interface Every class contains the constructor
 
 Rules to create an constructor:
 1.Class Name and constructor name should be similar
 2.no explicit return type
 
 Types Constuctors:
 
1.Default constructor

3.Non-paramaterized
2.Parameterized constructor

A(){
	
}
A(){
	
}
 
 
 
 */
 
 
 public class Constructor_Demo{
	 
	int i,j;
	 
	 Constructor_Demo(int i,int j){   
	 this.i=i;
	 this.j=j; 
	 }
	 void display(){
		 System.out.println("Value i"+i+"\t"+"Value j"+j);
	 }
	 
	 public static void main(String...abc){
		 Constructor_Demo obj=new Constructor_Demo(10,20);
		obj.display();
		
	 }
	 
	 
	 
 }
 
