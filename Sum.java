import java.util.Scanner;
public class Sum{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string");
    String a=s.nextLine();
    int sum=0;
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)>='1'&& a.charAt(i)<='9'){
        sum=a.charAt(i)-'0'+sum;
    }}
    System.out.println(sum);
  }
}