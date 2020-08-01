// User Defined Exceptions

package com.training.practice.exceptions;

import java.util.Scanner;

class StudentNotFoundException extends Exception {
	public StudentNotFoundException(String msg) {
		System.err.print(msg);
	}

}

class Student {
	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;

	}


public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}


public class Exception_10 {
	
	static void display() throws StudentNotFoundException {
		Student s1=new Student("Ram", 101);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values");
		int id=sc.nextInt();
		if(id==s1.getId()) {
			System.out.println(id+"Student with this id is present");
		}else {
			throw new StudentNotFoundException("The Student details are not valid");
		}
	}
   public static void main(String[] args)throws StudentNotFoundException {
	display();
}
}
