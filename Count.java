import java.util.Scanner;
public class Count {
  public static void main(String[] args){
    Scanner a=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=a.nextLine();
    int count=0;
    for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)!=' ')
        {
          count++;
        }
      }
        System.out.println(count);
      
  }
}