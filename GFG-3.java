public class Main{
    public static void main(String[]args){
        String xyz = "ABC";
        char[] abc = xyz.toCharArray();
        
        for(int i=0;i<xyz.length();i++){
            if(abc[i]>='A'&& abc[i]<='Z'){
               abc[i] = (char)(abc[i]+32); 
            }
            
        }
        
        System.out.println(abc);
        
    }
}
