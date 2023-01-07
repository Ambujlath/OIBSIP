/*hello Everyone
*/

import java.util.Scanner;
public class numberGuessing {
    public static void main(String[] args)

	{
        
      Scanner sc = new Scanner(System.in);

      int number = (int)(Math.random()*100);

      int usernumber = 0;

       do
	   {
		   
		 System.out.println("Welcome To This Game");
         System.out.println("Guess the number from 1 to 100::");
           usernumber = sc.nextInt();

            if(usernumber == number)
			{
              System.out.println("Hurray! This is Right Number");
                break;
        }

            else if(usernumber > number )
			{
              System.out.println("The number is higher");

            }
            else
			{
                System.out.println("The number is smalller");
            
            }
        }
        while(usernumber>= 0);
            System.out.println("..The number was ..:: ");
            System.out.println(number);
			System.out.println("Thank You for playing this Game.");

    }
    
}