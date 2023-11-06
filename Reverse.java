import java.util.Scanner;
public class Reverse{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string");
    String a=s.nextLine();
    String b=" ";
    System.out.println("Reverse String");
    for(int i=a.length()-1;i>=0;i--){
        char ch=a.charAt(i);
        b=b+ch;
    }
     System.out.println(b); 
  }
}