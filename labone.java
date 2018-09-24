package introtobackend;

import java.util.Scanner;

public class labone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scan = new Scanner(System.in);

        int userInputone = 0;
        int userInputtwo = 0;
        
        int hundredsone = 0;
        int tensone = 0;
        int onesone = 0;
        
        int hundredstwo = 0;
        int tenstwo = 0;
        int onestwo = 0;
        
        int hunSum = 0;
        int tensSum = 0;
        int onesSum = 0;
        
        
        //This will prompt user for the first input and guide them if not a 3-digit integer
        System.out.println("Please enter your first 3-digit number");
        userInputone = scan.nextInt();
        
            while ((userInputone < 100) || (userInputone > 999)) {
               System.out.println("Sorry! Please type a 3-digit number");
               userInputone = scan.nextInt();
            } 
            if ((userInputone >= 100) || (userInputone <= 999)) {
               System.out.println("Thanks!");
            }
        
      //Hundreds place digit of userInput1
      hundredsone = userInputone / 100;
      
      //Tens digit of userInput1
      tensone = (userInputone % 100) / 10;

      //Ones digit of userInput1
      onesone = (userInputone % 10);
      

      System.out.println("Please enter a second 3-digit number");
        userInputtwo = scan.nextInt();  
        
        while ((userInputtwo < 100) || (userInputtwo > 999)) {
               System.out.println("Sorry! Please type a 3-digit number");
               userInputtwo = scan.nextInt();
            } 
        if ((userInputtwo>= 100) || (userInputtwo <= 999)) {
               System.out.println("Thanks!");
            }
        
        //Hundreds place digit of userInput2
      hundredstwo = userInputtwo / 100;
      

      //Tens digit of userInput2
      tenstwo = (userInputtwo % 100) / 10;
      

      //Ones digit of userInput2
      onestwo = (userInputtwo % 10);
      
      
      //Equality in place values of inputs 1 & 2
      hunSum = hundredsone + hundredstwo;
      tensSum = tensone + tenstwo;
      onesSum = onesone + onestwo;
              
  if ((hunSum == tensSum) && (tensSum == onesSum)) {
           System.out.println("True");
        }
  
  else if ((hunSum != tensSum) && (tensSum != onesSum)) {
           System.out.println("False");
        }

	}
	
}