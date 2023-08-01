package week2;

public class Constructor {
	public static void main(String[] args) {
		Answer a= new Answer();
		Answer a1 = new Answer(60,"hello");
	}

}
class Answer {
	Answer() {
		System.out.println("no parameter...");
	}
	Answer(int a , String str){
		System.out.println(a+","+str);
	}
}