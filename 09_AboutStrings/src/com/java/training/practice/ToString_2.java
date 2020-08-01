//

package com.java.training.practice;


class Ball{
	
	String name,player;
	int price;
	Ball(String name,int price,String player){
		this.name=name;
		this.price=price;
		this.player=player;
	}
	Ball(String player){
		this.player=player;
	}
	public String toString(){
		return "Name is"+name+" "+"Price is"+price+" " +"Player is "+player;
	}
}

public class ToString_2{
	public static void main(String...abc){
		Ball b1=new Ball("Tennis Ball",70,"Nehwal");// 
		Ball b2=new Ball("Virat");
		System.out.println(b1);// tenis ball 70 nehwal
		System.out.println(b2);//null 0 virat
		
	}
}