import java.util.Scanner;
public class Pal{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string");
    String a=s.nextLine();
    String b=" ";
    for(int i=a.length()-1;i>=0;i--){
        char ch=a.charAt(i);
        b=b+ch;
    }
    if(a==b){
     System.out.println("String is palindrome"); 
  }
  else{
      System.out.println("String is not palindrome"); 
  }}
}