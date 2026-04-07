import java.util.*;

public class Main{
    public static void main(String[]args){
        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.addFirst(100);
        dq.addLast(900);
        
        System.out.print(dq.getLast());
        
    }
}

