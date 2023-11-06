import java.util.Scanner;
public class Vowel {
  public static void main(String[] args){
    Scanner a=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=a.nextLine();
  int vowelcount = 0;
        int consonentcount = 0;
    System.out.println("Enter a character");
    char c=a.next().charAt(0);
     for(int i = 0;i<s.length();i++)
        {
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vowelcount++;
            }
            else
                consonentcount++;
        }
        System.out.println("vowelcount " + vowelcount);
        System.out.println("consonent count " + consonentcount);
    }
}

        