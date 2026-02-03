import java.io.*;
import java.util.Scanner;
class FindAverage{
    
    int[] marks = new int[20];
    Scanner sc = new Scanner(System.in);
    
    FindAverage(){
        System.out.println("Provide marks of 20 students: ");
        for(int i=0;i<20;i++){
            System.out.println("Student "+(i+1)+": ");
            marks[i] = sc.nextInt();
        }
    }
    
    public void average(){
        int average=0;
        
        for(int i=0;i<20;i++){
            average+=marks[i];
        }
        
        average = average/20;
        
        System.out.println("The average marks of 20 students is:"+average);
    }
    
}

public class Main{
    public static void main(){
        FindAverage f1 = new FindAverage();
        f1.average();
    }
}
