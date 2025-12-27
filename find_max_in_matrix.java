import java.io.*;
import java.util.Scanner;
class MatrixCreator{
    int [][] matrix = new int[3][3];
    Scanner sc = new Scanner(System.in);
    MatrixCreator(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Element at: "+i+"|"+j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    
    public void findLargest(){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (matrix[i][j]>largest){
                  largest = matrix[i][j];
                
            }
        }
        }
        System.out.println("The Largest Value in the marrix is: "+largest);
    }
}

public class Main{
    public static void main(String[]args){
        MatrixCreator c = new MatrixCreator();
        c.findLargest();
    }
}
