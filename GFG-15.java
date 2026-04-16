import java.util.*;
class Solution {
    public int computeGCD(int a, int b) {
        // code here
       ArrayList<Integer> rf = new ArrayList<>();
       ArrayList<Integer> af = new ArrayList<>();
       ArrayList<Integer> bf = new ArrayList<>();
       
       
       //finding the facors of A
       
       for(int i=2;i*i<=a;i++){
           while(a%i==0){
             a = a/i;
             af.add(i);
           
           }
       }
       
       if(a>1){
           af.add(a);
       }


       //finding the factors of B 
       for(int j=2;j*j<=b;j++){
           while(b%j==0){
               b = b/j;
               bf.add(j);
           }
       }
       if(b>1){
           bf.add(b);
       }
       
       
       //finding the common elements between af and bf 
       
       for(int i=0;i<af.size();i++){
           for(int j=0;j<bf.size();j++){
               if(af.get(i)==bf.get(j)){
                   rf.add(af.get(i));
                   
                   af.remove(i);
                   bf.remove(j);
                   i--;
                  break;
               }
           }
       }
       
       //finding the product of rf elements
       if(rf.isEmpty()){
           return 1;
       }
       
       
       else{
           int r=1;
           for(int product: rf){
            
               r*=product;
               
           }
           return r;
       }
       
       
       
    }
}
