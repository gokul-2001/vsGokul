package week4;
interface Shapex {
	public String base = "This is shape1";
	public void display1();
}
interface Shapey extends Shapex {
	public String base ="This is shape2";
	public void display2();
}
class Shapeg implements Shapey {
	public String base ="This is shape3";

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Circle "+Shapex.base);
		
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Circle "+Shapey.base);
		
	}

	
}
public class Assignment5 {
	public static void main(String[] args) {
		Shapeg circle  = new Shapeg();
		circle.display1();
		circle.display2();
	}
	

}
