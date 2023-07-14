package wrapper;

public class WrapperClass {
	public static void main(String[] args) {
		byte b = 25;
		int i = 3;
		long l =1234567;
		float f = 123.6f;
		double d = 123.66;
		char ch ='a';
		boolean bool = true;
		
		Byte ab = new Byte(b);
		Integer ai = new Integer(i);
		Long al =new Long(l);
		Float af = 123.6f;
		Double ad = new Double(d);
		Character ach =new Character(ch);
		Boolean aab = new Boolean(bool);
		
		Byte bb = b;
	    Integer bi = i;
	    Long blong = l;
	    Float bf = f;
	    Double bd = d;
	    Character bch = ch;
	    Boolean bbool= bool;
	    
	    b = bb;
	    i = bi;
	    l = blong;
	    f = bf;
	    d = bd;
	    ch = bch;
	    bool = bbool;
	    
	}

}
