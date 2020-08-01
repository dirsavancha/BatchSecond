package com.training.practice.usecase.tea;

public class Hotel {

	  public static void orderTea(String teaType) {
		  
		  if(teaType.equalsIgnoreCase("GingerTea")) {
			  GingerTea gt=new GingerTea(teaType);
			  gt.teaPrice();
		  }else if(teaType.equalsIgnoreCase("LemonTea")) {
			  LemonTea lt=new LemonTea(teaType);
			  lt.teaPrice();
		  }else {
			  System.out.println("Sorry" + teaType + "is not available");
		  }
	  }
	
}
