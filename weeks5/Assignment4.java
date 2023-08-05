package weeks5;

import java.util.Scanner;

interface Number {
	int findSqr(int i);
}
class A implements Number{
    int i,square;
	@Override
	public int findSqr(int i) {
		// TODO Auto-generated method stub
		square = i*i;
		return square;
	}
	
}
public class Assignment4 {
	public static void main(String[] args) {
		A a = new A();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(a.findSqr(i));
	}

}
