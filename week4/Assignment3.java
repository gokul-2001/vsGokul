package week4;
interface ExtraLarge {
	static String extra = "This is extra Large";
	void display();
}
class Large{
	public void print() {
		System.out.println("This is large");

	}

}
class Medium extends Large {
	public void print() {
		System.out.println("This is medium");
		super.print();
	}
	
}
class Small extends Medium {
	public void print() {
		System.out.println("This is small");
		super.print();
	}
}
public class Assignment3 implements ExtraLarge {
	public static void main(String[] args) {
		Small s = new Small();
		s.print();
		Assignment3 a = new Assignment3();
		a.display();
		
	}

	@Override
	public void display() {
		System.out.println(extra);
		
	}

}
