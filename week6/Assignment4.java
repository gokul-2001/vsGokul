package week6;
class Pair {
	private int a,b;
	
	public Pair() {
		 a = 0;
		 b = 0;
	}
	public synchronized int sum() {
		return(a+b);
	}
	public synchronized void inc() {
		a++;
		b++;
	}
}

public class Assignment4 extends Thread{
	public final int count =1000;
	private Pair pair;
	public Assignment4(Pair pair) {
		this.pair = pair;
	}
	public void run() {
		for(int i=0;i<count;i++) {
			pair.inc();
		}
	}
	public static void main(String[] args) {
		Pair p = new Pair();
		Assignment4 a1 = new Assignment4(p);
		Assignment4 a2 = new Assignment4(p);
		Assignment4 a3 = new Assignment4(p);
		a1.start();
		a2.start();
		a3.start();
		try {
			a1.join();
			a2.join();
			a3.join();
		}
		catch(InterruptedException ignored) {
		}
		System.out.println("Final sum: "+p.sum());
	}
	

}
