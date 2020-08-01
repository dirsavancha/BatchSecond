

public class Employee{
	
	void emp_Details(String name,int id,float sal){
		
		System.out.println("Emp Name"+name+"\t"+"Emp Id"+id+"\t"+"Emp Sal"+sal);
	}
	
	 String emp_Details_2(String name,int id){
		 
		 return "Name "+name+"\t"+"id"+id;
	 }
	
	public static void main(String...abc){
		Employee emp1=new Employee();
		emp1.emp_Details("Ram",101,500.0f);
		
		Employee emp2=new Employee();
		emp2.emp_Details("Hari",102,1000.0f);
		String details=emp2.emp_Details_2("Hyderabad",500);
		System.out.println(details);
	}
}