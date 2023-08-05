package weeks5;

import java.util.Scanner;

interface GCD {
	public int findGCD(int n1,int n2);
}
class B implements GCD {
int n1,n2;
	@Override
	public int findGCD(int n1, int n2) {
		// TODO Auto-generated method stub
		if(n1==0&n2==0) {
			return -1;
		}
		else if(n2==0) {
			return n1;
		}
		else 
			return findGCD(n2, n1%n2);
	}
	
}
public class Assignment5 {
	public static void main(String[] args) {
		B b = new B();
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(b.findGCD(n1, n2));
		
	}

}
