package closed_book;

public class Prime_number_1_to_100 {
	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		String primenumbers = "";
		for(i=1;i<=100;i++) {
			int counter = 0;
			for(num = i;num>=1;num--) {
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if(counter ==2) {
				primenumbers = primenumbers + i + " ";
				
			}
		}
		System.out.println("prime numbers are: ");
		System.out.println(primenumbers);
		
	}

}
