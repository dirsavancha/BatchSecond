package com.java.training.practice;

// Hashcode want to generate distict integer (Unique)

class Person{
	String name;
	int mobile;
	Person(String name,int mobile){
		this.name=name;
		this.mobile=mobile;
	}
	 public int hashCode() {
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;
    }
	public boolean equals(Person c){
	  if(this.mobile!=c.mobile){
		  return false;
	  }
	  return true;
	}
	 public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}

public class HashCodeExample_1{
	public static void main(String...args){
		Person p1=new Person("Ram",101);
		Person p2=new Person("Ram",101);
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println(p1.equals(p2));
		
		
		
		
		/*String str3="FB";
		String str4="Ea";
		System.out.println(str3.hashCode()+" "+str4.hashCode());// diffrent hash-->hashcode same ---
		//System.out.println(str3.equals(str4));  //true*/
		
		
	}
}