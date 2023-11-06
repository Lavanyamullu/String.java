import java.util.Scanner;
public class Frequency
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String a=sc.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++){
		    if(a.charAt(i)=='a')
		    {
		        count++;
		    }
		}
		System.out.println(count);
	}
}