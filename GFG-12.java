import java.util.*;

public class Solution {
    public static void solve() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        String data = reader.readLine();
        int x = Integer.parseInt(data);
        
        for(int i =1;i<=10;i++){
            System.out.print(x*i+"\s");
        }
        }
        catch(IOException e){
            System.out.print("Error");
        }
    }
}
