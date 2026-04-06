class Solution {
    public static void printPrimeFactorization(int n) {
        ArrayList<Integer> r = new ArrayList<>();
     
        while(n%2==0){
                n=n/2;
                r.add(2);
                
        }
        
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                n=n/i;
                r.add(i);
            }
            if(n==1){
                break;
            }
        }
        
        if(n > 1) {
            r.add(n);
        }
        
        for(int x: r){
            System.out.print(x+"\s");
        }
    
    }
}
