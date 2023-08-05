package week6;

public class Assignment2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" has ended");
		
	}
	public static void main(String[] args) {
		Assignment1 ex = new Assignment1();
		Thread t = new Thread(ex);
		t.setName("Main thread");
		t.start();
		System.out.println("welcome");
		t.setName("Main thread");
		
	}

	

}
