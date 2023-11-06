import java.util.Scanner;
public class Pog2 {
public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String");
        String a=s.nextLine();
        String[] words=a.split(" ");
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
    }
}