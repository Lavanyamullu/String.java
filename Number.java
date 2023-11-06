import java.util.Scanner;
public class Number{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    int rem,rev=0;
      int temp=a;
    while(a!=0){
      rem=a%10;
      rev=rev*10+rem;
      a=a/10;
    }
    if(temp==rev){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not palindrome");
    }
    
  }
}