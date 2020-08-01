// passing Object as an array

package com.java.training.practice;

class Student{
	String name,adress;
	int id;
	Student(String name,String adress,int id){
		this.name=name;
		this.adress=adress;
		this.id=id;
	}
	/*static void display(){
		System.out.println("Name is :"+Name+" "+"Adress is :"+adress+" "+"Id is :"+id);
	}*/
}
public class PassingObjectAsParm{
	public static void main(String...abc){
		Student s1=new Student("Ram","Bangalore",100);//0
		Student s2=new Student("Hari","Chennai",101);//1
		Student s3=new Student("Shyam","Hyderabad",102);
		
		System.out.println("Name"+"\t"+"Adress"+"\t"+"ID");
		Student[] arr=new Student[3];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		for(Student s:arr){
			System.out.println(s.name+"\t"+s.adress+"\t"+s.id);
		}
	}
}