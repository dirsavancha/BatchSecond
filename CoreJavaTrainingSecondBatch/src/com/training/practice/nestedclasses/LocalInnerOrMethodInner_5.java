package com.training.practice.nestedclasses;

import com.sun.javafx.geom.transform.BaseTransform.Degree;

import sun.applet.Main;

class Outer5{
	
	void outerShow() {
		class MethodInner{
			void methodInnerDisplay() {
				System.out.println("I am Method Inner class method display ");
				
			}
		}
		MethodInner obj=new MethodInner();
		obj.methodInnerDisplay();
	}
}
public class LocalInnerOrMethodInner_5 {
   public static void main(String[] args) {
	   new Outer5().outerShow();
}
}
