import java.io.*;
import java.util.Scanner;
class FindS{
    int lena;
    int lenb;
    int [] A;
    int[] B;
    int [] S;
    Scanner sc = new Scanner(System.in);
    FindS(){
        System.out.println("How many values you want for A: ");
        this.lena = sc.nextInt();
        System.out.println("How many values you want for B: ");
        this.lenb = sc.nextInt();
        
        this.A = new int[lena];
        this.B = new int[lenb];
        if (lena<=lenb){
           this.S = new int[lena];
        }
        else{
            this.S = new int[lenb];
        }
        
        for(int i=0;i<lena;i++){
            System.out.print("Element for A at the index: "+i);
            A[i] = sc.nextInt();
        }
        for (int j=0;j<lenb;j++){
            System.out.print("Element for B at the index: "+ j);
            B[j] = sc.nextInt();
        }
        
    }
    
    public void calculateS(){
        int min;
        if (lena<=lenb){
            min = lena;
        }
        else{
            min= lenb;
        }
        
        for(int i=0;i<min;i++){
            S[i] = A[i]+B[i];
        }
        
        System.out.println("Values of S after the Calculation: ");
        for(int i=0;i<min;i++){
            System.out.print(S[i]+" ");
        }
    }
 }
 
 //driver class 
 
 public class Main{
     public static void main(String[]args){
         FindS  s = new FindS();
         
         s.calculateS();
     }
 }
