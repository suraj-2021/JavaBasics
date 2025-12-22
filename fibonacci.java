class Fibonacci{
    int n;
    int a=0;
    int b=1;
    Fibonacci(int n){
        this.n = n;
    }
    
    void fibonacci(){
        System.out.print(a+" "+ b+" ");
        for(int i=3;i<=n;i++){
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}

public class Main{
    public static void main(String[]args){
        Fibonacci fi = new Fibonacci(10);
        fi.fibonacci();
    }
}
