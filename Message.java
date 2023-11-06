import java.util.Scanner;
public class Message{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string");
    String a=s.nextLine();
    String res=" ";
    for(int i=0;i<a.length();i=i+2){
        res=res+a.charAt(i);
    }
     for(int i=1;i<a.length();i=i+2){
        res=res+a.charAt(i); 
  }
    System.out.println(res.toString());
  }
}