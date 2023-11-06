import java.util.*;
public class Unique{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Unique character");
        System.out.println("Enter as string");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                   System.out.println(ch[i]);
                     }
            }
             
            
        }   
	}
}
