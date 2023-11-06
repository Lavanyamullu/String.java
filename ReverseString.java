/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.reverse();
        System.out.println("Reversing entire string: " + stringBuffer);
        String reversedWords = reverseWordsInString(input);
        System.out.println("Reversing each word at its place: " + reversedWords);
    }
    public static String reverseWordsInString(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedWords.append(reversedWord).append(" ");
        }
        return reversedWords.toString().trim();}
}
      //main method

//declare variables and take input from user

//creat stringbuffer object for string reversing

//reverse input string

//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result

    //main method

//declare variables and take input from user

//creat stringbuffer object for string reversing

//reverse input string

//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result


//main method

//declare variables and take input from user

//creat stringbuffer object for string reversing

//reverse input string

//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result

