package sample;

public class largest_of_3 {
	public static void main(String[] args) {
		int n1=23, n2=24, n3=28;
		if(n1>n2 && n1>n3)
			System.out.println(n1 + " is  largest");
		else if(n2>n1 && n2>n3) 
			System.out.println(n2 + " is largest");
		else 
			System.out.println(n3 + " is largest");
		
		
	}

}
