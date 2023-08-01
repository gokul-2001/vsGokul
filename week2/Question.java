package week2;

public class Question {
	public static void main(String[] args) {
		Question q = new Question();
		q.student();
	}
	public void print(Question q) {
		System.out.println("well done...");
	}
	public void student() {
		print(this);
	}

}
