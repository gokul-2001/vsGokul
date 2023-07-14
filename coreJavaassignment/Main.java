package coreJavaassignment;

public class Main {
	public static void main(String[] args) {
		
		  Person obj = new Person(); 
		  obj.setName("Gokul"); 
		  obj.setAge(18);
		  obj.setAddress("Perambur");
		  
		  System.out.println( "Name: "+obj.getName());
		  System.out.println("Age: "+obj.getAge());
		  System.out.println("Address: "+obj.getAddress());
		
		System.out.println("##########################################");
	    Person per1 = new Person("Gershome", 21, "Kaniyakumari");
	    Person per2 = new Person("Hariharan S ", 21, "Pudukottai");
	    System.out.println(per1);
	    System.out.println(per2);
	    Person.count();
	    
	    
	    System.out.println("---------------------------------------------");
	    Employee obj1 = new Employee();
	    
	    
	    
	    System.out.println("Employee Id: "+obj1.getEmployeeid());
	    System.out.println("Salary: "+obj1.getSalary());
	    
	    
	}

}
