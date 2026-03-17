import java.util.*;

public class Main {
    public static void main (String[]args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       char[] S = s.toCharArray();
       int len = S.length;
       int mid = len/2;
       
       for(int i=0;i<mid;i++){
           char x = S[i];
           S[i]= S[len-i-1];
           S[len-i-1]= x;
       }
       
       String X = new String(S);
       System.out.println(X);
        
    }
    
}
