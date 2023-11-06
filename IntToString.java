/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;
public class IntToString 
{
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();
        String strNumber = Integer.toString(number);
        char charAtIndex = strNumber.charAt(2);
        System.out.println("Char at index position 2 = " + charAtIndex);}
}
//main method

//declare int type variable

//take input from user

//converting integer to string using toString method

//use inbuilt function to print index position

//print result

