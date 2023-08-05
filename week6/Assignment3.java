package week6;
interface A {
	public abstract void run();
}
class B implements A {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class MyThread extends B {
	public void run() {
		System.out.println("NPTEL java week 6");
	}
}
public class Assignment3 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.run();
	}

}
