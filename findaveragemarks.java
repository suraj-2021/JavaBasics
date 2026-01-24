import java.io.*;
import java.util.Scanner;

class AverageMarks{
    int[] roll_no = new int[5];
    int total;
    Scanner sc = new Scanner(System.in);
    AverageMarks(){
        float total_ = 0.0;
        System.out.println("Maths,Science,English Marks?: ");
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                if(roll_no[i] == 0){
                    System.out.println("Provide the roll No: ");
                    roll_no[i] = sc.nextInt();
                }
                System.out.println("Marks of Student"+i+1+"subject "+j+1+" ");
                  total_+=sc.nextInt();
            }
        }
        this.total = total_;
    }
    
    public void display_average(){
        float average = total/5;
        
        System.out.println("The average marks of the given student are: "+average);
    }
    
    
}

public class Main{
    public static void main(String[]args){
        AverageMarks avg = new AverageMarks();
        avg.display_average();
    }
}
