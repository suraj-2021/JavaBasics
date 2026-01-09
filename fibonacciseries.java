import java.io.*;

class fibonacci{
    int n = 10;
    fibonacci(int x){
       this.n=x;
    }
    
    public void generateseries(){
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
            
        for(int i=3;i<=10;i++){
            int c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        
}
}

public class Main{
    public static void main(String[]args){
        fibonacci f = new fibonacci(10);
        f.generateseries();
    }
}
