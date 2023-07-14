package coreAssignment2;

public class Main {
	public static void main(String[] args) {
		 BankAccount obj  = new BankAccount(1234,3000.0,"Gokul");
		 System.out.println(obj);
		 obj.setBalance(4567.0);
		 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		 System.out.println("Bank Account after modification");
		 System.out.println(obj.getBalance());
	}

}
