package week2;

public class MethodPrint2 {
	public static void main(String[] args) {
		Printer pr = new Printer();
		pr.print();
		pr.print("Hi this is school");
	}

}
class Printer {
	public void print() {
		System.out.println("Hi i am student");
	}
	public void print(String s) {
		System.out.println(s);
	}
}
