package week2;

public class MethodPrint {
	public static void main(String[] args) {
		Student st = new Student();
		School sc = new School();
		sc.print();
		st.print();
		
	}

}
class Student {
	public void print() {
		System.out.println("Hi i am student");
	}
}
class School {
	public void print() {
		System.out.println("Hi this is school");
	}
}
