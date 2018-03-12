/**********************************************************************************

//
// Title:    object Runtime.
// Course:     CSC 3020
// Homework:   4-2
// Author:     Gayatari patel
// Date:       26 October 2016
// Description: java program that shows information about your computer 
//
//**********************************************************************************
 */

package runtime;

public class runtime
{

	public static void main(String[] args)
	{
		
		final long  MEGABYTE = (1024*1024); 
	//	final long  MEGABYTE = 1000000;  
		 long maxmega= Runtime.getRuntime().maxMemory() / MEGABYTE ;  
		 long totalmega= Runtime.getRuntime().totalMemory() / MEGABYTE ;
		 long freemega= Runtime.getRuntime().freeMemory() / MEGABYTE ;
		
		    	 System.out.println("welcome to the program that counts inforamtion about your computer");
		    	 System.out.println("....................................................................");
		    	 System.out.printf( "%-26s%-,11d%4s%,10d%3s","\nMaximum memory: " , Runtime.getRuntime().maxMemory() , " bytes ",maxmega ,"MB");
		    	 System.out.printf( "%-26s%-,11d%4s%,10d%3s","\nTotal memory: " , Runtime.getRuntime().totalMemory() , "   bytes ",totalmega ,"MB");
		    	 System.out.printf( "%-26s%-,11d%4s%,10d%3s","\nFree memory: " , Runtime.getRuntime().freeMemory() , "   bytes ",freemega ,"MB");
		         System.out.printf("%-26s%-11d","\nAvailable processors:   " , Runtime.getRuntime().availableProcessors() );
		         System.out.println("\n\nEnd of the program");
		    	 System.out.println("....................................................................");
		

	}
	}


