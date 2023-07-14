package wrapper;

public class StringHandling {
	public static void main(String[] args) {
		String s1 = new String("Gokul");
		String s2 = new String("gok");
		System.out.println("Length of string s1: "+s1.length());
		System.out.println("concatenation s1: "+s1.concat(s2));
		System.out.println("SubString starting from 1: "+s1.substring(2));
		System.out.println("SubString starting from 0 to 4: "+s1.substring(0,4));
		System.out.println("charAt of 3: "+s1.charAt(0));
		System.out.println("index of k: "+s1.indexOf('k'));
        System.out.println("upper case of string s2: "+s2.toUpperCase()); 
		System.out.println("Last index of string s1: " +s1.lastIndexOf('l'));
		System.out.println("lower case of string s2: "+s2.toLowerCase());
		System.out.println("replace o to #: "+s1.replace('o', '#'));
		System.out.println("compare to"+s1.compareTo(s2));
		System.out.println("equals to: "+s1.equals(s2));
		char[] ch =s1.toCharArray();
		System.out.println(String.valueOf(ch));
		
		
		
		
	}

}
