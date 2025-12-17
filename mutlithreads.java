class Counter extends Thread{
    String ThreadName;
    
    Counter(String name){
        this.ThreadName = name;
    } 
    
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(ThreadName+" : "+i);
            try{
                Thread.sleep(0);
            }catch(InterruptedException e){
                System.out.println("Process Inerrupted!");
            }
        }
        
        System.out.println(ThreadName+" "+"Completed!");
    
    }
} 

public class Main{
    public static void main(String[]args){
        Counter t1 = new Counter("Thread1");
        Counter t2 = new Counter("Thread2");
        
        t1.start();
        t2.start();
        
        System.out.println("Main Thread Completed!");
    }
}
