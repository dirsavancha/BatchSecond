package com.training.practice.map;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	
	String name;
	int id;
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	@Override
	public int compareTo(Employee e) {
		int j=e.id;
		int i=this.id;
		System.out.println("I value is: "+i+"J value is: "+j);
		if(i>j) {
			return +1;
			
		}else if(i<j) {
			return -1;
		}else {
			return 0;
		}
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}

public class Comparable_Demo {
	public static void main(String[] args) {
		Employee e1=new Employee("Tom", 103);
		Employee e2=new Employee("Tom", 101);
		Employee e3=new Employee("Tom", 100);
		Employee e4=new Employee("Tom", 108);
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		Collections.sort(al);
		System.out.println(al);
	}

}
