import java.util.Scanner;
public class Replace{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
    String s1=sc.nextLine();
    System.out.println("Enter a character which you want");
    char ch=sc.next().charAt(0);
    String a=s1.replace(' ',ch);
    System.out.println(a);
    
  }
}