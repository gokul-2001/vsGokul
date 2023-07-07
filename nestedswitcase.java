package sample;

public class nestedswitcase {
	public static void main(String[] args) {
		int tech = 1;
		int course = 1;
		switch(tech) {
		case 1:
		
			System.out.println("java");	
			break;
		case 2:
		
			switch(course){
			case 1: 
			
				System.out.println("django");
				break;
			
			case 2:
			
				System.out.println("advanced python");
			}
			}
		
		
			
		}
	}


