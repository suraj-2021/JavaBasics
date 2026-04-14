class Solution {
    public void printPattern(int n) {
        
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.println("*");
            }
            else if(i<n-1){
             System.out.println("*"+" ".repeat(i)+ "*");
            } 
            else{
                System.out.println("*".repeat(n));   
            }
        
    }
} 
}
public class Main
{
	public static void main(String[] args) {
		Solution s = new Solution();
		s.printPattern(9);
	}
}
