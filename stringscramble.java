import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("String One: ");
        String s1 = sc.nextLine();
        System.out.println("String Two: ");
        String s2 = sc.nextLine();
        
        // finding the length of the strings 
        System.out.println("Length String 1: "+s1.length()+"  The length of String 2: "+s2.length());
        
        //printing the initial characters of the strings 
        System.out.println(""+s1.charAt(0) + s2.charAt(0));
        
        //Concatnate string one to string two 
        System.out.println(s1+s2);
        
        //reversing the concatnated string
        String s3 = s1+s2;
        String reversed = "";
        for(int i=s3.length()-1;i>=0;i--){
            reversed+=s3.charAt(i);
            
        }
        
        System.out.println("Reversed Result is: "+reversed);
    }
}
