package week6;


public class Assignment5 extends Thread {
	public void run() {
		
	}
	public static void main(String[] args) {
		Assignment5 t1 = new Assignment5();
		System.out.println("Name of thread 't1':"+t1.getName());
		Assignment5 t2 = new Assignment5();
		System.out.println("Name of thread 't2':"+t2.getName());
		t1.start();
		t1.setName("week6");
		t2.start();
		t2.setName("Assignment5");
		System.out.println("new name of thread of t1:"+t1.getName());
	    System.out.println("new name of thread of t2:"+t2.getName()); 
	}

}
