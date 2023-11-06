import java.util.Scanner;
public class Pog3 {
public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String");
        String a=s.nextLine();
        int lower=0,upper=0,special=0,num=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='a' && c<='z'){
                lower++;
            }
            else if(c>='A' && c<='Z'){
                upper++;
            }
            else if(c>='0' && c<='9'){
                special++;
            }
            else{
                num++;
            }
        }
        System.out.println("lower: "+lower);
        System.out.println("upper: "+upper);
        System.out.println("special: "+special);
        System.out.println("number: "+num);
    }
}