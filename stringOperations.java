class TwoStrings{
    String string1;
    String string2;
    String concatnatedString;
    
    TwoStrings(String s1,String s2){
        this.string1=s1;
        this.string2=s2;
    }
    
    public void slength(){
        System.out.println("Length of String1: "+string1.length());
        System.out.println("Length of String2: "+string2.length());
    }
    
    public void initials(){
        char i1 = string1.charAt(0);
        char i2 = string1.charAt(string1.indexOf(" ")+1);
        
        char i3 = string2.charAt(0);
        char i4 = string2.charAt(string2.indexOf(" ")+1);
        
        System.out.println("String1 initials: "+i1+i2);
        System.out.println("String2 initials: "+i3+i4);
    }
    
    public void concatnation(){
        char[] resultArray = new char[(string2.length()+string1.length())];
        
        int k=0;
        
        for(int i=0;i<string1.length();i++){
            resultArray[k]= string1.charAt(i);
            k++;
        }
        
        for(int i=0;i<string2.length();i++){
            resultArray[k] = string2.charAt(i);
            k++;
        }
        
        String resultString = new String(resultArray);
        
        System.out.println("Concatnated String: "+resultString);
        
    }
    
    public void reverseString(){
        
        char[] resultArray = new char[concatnatedString.length()];
        int k=0;
        for(int i=concatnatedString.length();i>=0;i--){
            resultArray[k]=concatnatedString.charAt(i);
            k++;
        }
        
        String resultString = new String(resultArray);
        
        System.out.println("Reversed String is: "+resultString);
        
        
    }
    
} 
//Main Driver Function 

public class Main{
    public static void main(String[]args){
        TwoStrings t1 = new TwoStrings("Hello World","Good Work");
        
        t1.slength();
        t1.initials();
        t1.concatnation();
        t1.reverseString();
    }
}
