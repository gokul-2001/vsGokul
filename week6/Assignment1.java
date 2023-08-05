package week6;

public class Assignment1 extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		Assignment1 thread = new Assignment1();
		thread.start();
	}

}
