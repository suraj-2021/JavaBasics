public class doWhileExample{
    public static void main(String[]args){
        int count =1;
        int product;
        System.out.println("Table of 6: ");
        
        do{
            product = 6*count;
            System.out.println("6*"+count+"="+product);
            count++;
        } while(count<=10);
        
    }
}
