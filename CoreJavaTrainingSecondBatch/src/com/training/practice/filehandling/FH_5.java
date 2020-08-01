package com.training.practice.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	transient String name;
	 int id;
	public Student( String name,int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}



public class FH_5 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try(FileOutputStream fos=new FileOutputStream("abc.txt");ObjectOutputStream oos=new ObjectOutputStream(fos)){
			Student s1=new Student("Ram",101);
			oos.writeObject(s1);
		
			
		}
		try(FileInputStream fis=new FileInputStream("abc.txt");ObjectInputStream ois=new ObjectInputStream(fis)){
			System.out.println(ois.readObject());
			
		}
		
		
	}

}
