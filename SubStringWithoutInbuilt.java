/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;
public class SubStringWithoutInbuilt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the search string: ");
        String searchString = scanner.nextLine();
        if (isSubString(inputString, searchString)) 
        {
            System.out.println(searchString + " is found");
        } 
        else 
        {
            System.out.println(searchString + " is not found");
        }
    }
    public static boolean isSubString(String inputString, String searchString) 
  {
        int inputLength = inputString.length();
        int searchLength = searchString.length();

        for (int i = 0; i <= inputLength - searchLength; i++) 
        {
            int j;
 for (j = 0; j < searchLength; j++) 
            {
                if (inputString.charAt(i + j) != searchString.charAt(j)) {
                    break;
                }
            }
            if (j == searchLength) 
            {
                return true;
            }
        }
    
        return false;
    
}}
//main method

//declare variables

//take input from user

//compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false

