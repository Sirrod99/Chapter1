/**
 * 
 */
package integerdemo1;

/**
 * @author zd131147
 *
 */
public class IntegerDemo1 {
	static int anInt = 1234;
	static byte aByte = 12;
	static short aShort = 12345;
	static long aLong = 1234567890987654321L;
	static double anotherInt;
	
	public static void main(String[] args) 
	{
		anotherInt = anInt * 10000000;
		
		System.out.println("The int is " + anInt);//1234
        System.out.println("The byte is " + aByte);//12
        System.out.println("The short is " + aShort);//12345
        System.out.println("The long is " + aLong);//1234567890978654321
        System.out.println("Another int is " + anotherInt);                
	}

}
