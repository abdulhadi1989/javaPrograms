

public class IntegerPrimitives {

	public static void main(String[] args) {
		
		byte b=1; //Range -128 to 127
		short s=2; //Range -32,768 to 32,767
		int i=1; //Range -2,147,483,648 to 2,147,483,647
		long l = 1L; //Range 
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int decVal = 26; // number 26 is decimal
		int octVal = 032; // Octal
		int hexVal = 0x1a; //hexadecimals
		int binVal = 0b11010; // binary
		
		System.out.println("VAlue ="+ decVal+ "  "+octVal+ "  "+hexVal+ "  "+binVal);
	}
}
