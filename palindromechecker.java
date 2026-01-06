import java.io.*; 

class myString{
    String string;
    
    myString(String s){
        this.string = s;
    }
    
    public void isPalindrome(){
        int flag = 1;
        int l = string.length()/2;
        
        for(int i=0;i<l;i++){
            if(string.charAt(i)!=string.charAt(l-i-1)){
                flag=0;
            }
        }
        
        if(flag!=0){
            System.out.println(string+", is a palindrome!");
        }
        else{
            System.out.println(string+", is not a palindrome!");
        }
    }
}

//main  

public class Main{
    public static void main(String[]args){
        myString s1 = new myString("center");
        s1.isPalindrome();
    }
}
