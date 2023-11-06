import java.util.*;
public class Pog1
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a Sting");
	    String a=s.nextLine();
	    int sum=0;
	    for(int i=0;i<a.length();i++){
	        if(Character.isDigit(a.charAt(i))){
	            sum=sum+Character.getNumericValue(a.charAt(i));	        }
	    }
		System.out.println(sum);
	}
}