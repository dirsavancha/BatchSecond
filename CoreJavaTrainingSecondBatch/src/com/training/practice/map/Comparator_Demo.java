package com.training.practice.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	String name;
	int id;
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}
class SortByName implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		 Student s1=(Student)o1;                                   
		 Student s2=(Student)o2;
		
		return s1.name.compareTo(s2.name);
	}
	
	
}
class SortById implements Comparator<Object >{
	public int compare(Object o1,Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.id>s2.id) {
			return +1;
		}else if(s1.id<s2.id){
			return -1;
		}else {
			return 0;
		}
		
	}
	
}

public class Comparator_Demo {
	public static void main(String[] args) {
		Student s1=new Student("Tom",100);
		Student s2=new Student("John",120);
		Student s3=new Student("Tom",105);
		Student s4=new Student("Sheetal",112);
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al,new SortById());
		//Collections.sort(al, new SortByName());
		System.out.println(al);
		
	}

}
