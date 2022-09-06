/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps1;
import java.util.*;
public class PS1 {

    static void Question2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade");
        String grade = sc.nextLine();
        int i=0;
        int n = grade.length();
        double val =0.0;
        while(i<n){
            if(grade.charAt(i)=='A'){
            val +=4;
                if(grade.charAt(i+1)=='+'){break;}
            }
            else if(grade.charAt(i)=='B'){
            val+=3;
            }
            else if(grade.charAt(i)=='C'){
            val+=2;
            }
            else if(grade.charAt(i)=='D'){
            val+=1;
            }
            else if(grade.charAt(i)=='F'){
            val+=0;
            break;
            }
            else if(grade.charAt(i)=='+'){
            val+=0.3;
            }
            else if(grade.charAt(i)=='-'){
            val-=0.3;
            }
        i++;
        }
        System.out.println(val);
    }
    static void Question3()
    {
        Scanner sc = new Scanner(System.in);
        String s1= "KS";
        String String1 = "Queen";
        String String2 = "Hearts";
        String denom = s1.substring(0, 1);
	String suite = s1.substring(1);
		if (denom.equalsIgnoreCase("K"))
		{
			String1 = "King";
		}
		else if (denom.equalsIgnoreCase("Q"))
		{
			String1 = "Queen";
		}
		else if (denom.equalsIgnoreCase("J"))
		{
			String1 = "Jack";
		}
		else if (denom.equals("10"))
		{
			String1 = "Ten";
		}
		else if (denom.equals("9"))
		{
			String1 = "Nine";
		}
		else if (denom.equals("8"))
		{
			String1 = "Eight";
		}
		else if (denom.equals("7"))
		{
			String1 = "Seven";
		}
		else if (denom.equals("6"))
		{
			String1 = "Six";
		}
		else if (denom.equals("5"))
		{
			String1 = "Five";
		}
		else if (denom.equals("4"))
		{
			String1 = "Four";
		}
		else if (denom.equals("3"))
		{
			String1 = "Three";
		}
		else if (denom.equals("2"))
		{
			String1 = "Two";
		}
		else if (denom.equalsIgnoreCase("A"))
		{
			String1 = "Ace";
		}


		if (suite.equalsIgnoreCase("D"))
		{
			String2 = "Diamonds";
		}
		else if (suite.equalsIgnoreCase("H"))
		{
			String2 = "Hearts";
		}
		else if (suite.equalsIgnoreCase("C"))
		{
			String2 = "Clubs";
		}
		else if (suite.equalsIgnoreCase("S"))
		{
			String2 = "Spades";
		}
             System.out.println(String1 + " of " + String2);

    }
    
    static void Question4(){
        System.out.println("I can calculate the cost of driving your car for 100 miles. I can also say how far you can go with what is in your tank.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for gas in the gas tank
		System.out.print("Please tell me how many galons of gas you have in your gas tank, you can use fractions: ");
		float inTheTank = keyboard.nextFloat();
		// prompt the user for mpg
		System.out.print("Please tell me how many milles per galons your car gets, please use a whole number: ");
		int mpg = keyboard.nextInt();
		// prompt the user for gas price
		System.out.print("Please tell me how much is a gallon of gas curently, you can use fractions: ");
		float gasPrice = keyboard.nextFloat();
		 
		// start the output
		System.out.println("----------------------------------------------------------------------");
		System.out.println("With gass at $" + gasPrice + " per gallon, going 100 miles will cost you $" + (gasPrice * 100) );
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Since your car's efficiency is " + mpg + " mpg and given that you have " +  inTheTank + " gallons in the tank, by my calculations you can go " + (int)(mpg * inTheTank) + " miles before you run out of gas.");
		System.out.println("----------------------------------------------------------------------"); 
		 
    }
    public static void main(String[] args) {
        //Question2();
        //Question3();
        Question4();
    }
    
}
