import java.util.*;
public class Program5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    String result="";
    for(int i=0;i<s.length();i+=2)
    
      result+=s.charAt(i);
      {
        result+="";
        for(int i=1;i<s.length();i+=2)
          {
          result+=s.charAt(i);
      }
    System.out.println(result.toString());
        
      }
    
  }
  }