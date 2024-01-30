package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App
{
	/**
	 * Main program:  The entry point of the program. The local time will be printed first,
	 *      Then it will create two binary variables, add them and print the result.
	 *
	 * @param args: not used
	 */
	public static void main( String[] args )
	{	//displaying local time
		LocalTime currentTime = new LocalTime();
		System.out.println("Current local time is: " + currentTime);

		Binary binary1=new Binary("111111");
		System.out.println( "First number is "+ binary1.getValue());

		Binary binary2=new Binary("111001");
		System.out.println( "Second number is "+ binary2.getValue());

		Binary sum = Binary.add(binary1,binary2);
		System.out.println( "SUM:"+ sum.getValue());

		Binary or = Binary.or(binary1, binary2);
		System.out.println("OR:" + or.getValue());

		Binary and = Binary.and(binary1, binary2);
		System.out.println("AND:" + and.getValue());

		Binary product = Binary.multiply(binary1, binary2);
		System.out.println( "MULT:"+ product.getValue());
	}
}