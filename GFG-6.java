class Solution {
    String isVowel(char c) {
        String arr = "aeiouAEIOU";
        char[] ar = arr.toCharArray();
        
        for(int i=0;i<10;i++){
            if (c == ar[i]){
                return "YES";
            }
        }
        
        return "NO";
        
    }
}
