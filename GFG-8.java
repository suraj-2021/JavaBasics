class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
           ArrayList<Integer> result = new ArrayList<>();
           HashMap<Integer, Integer> freqB = new HashMap<>();
           
           for(int x:b){
               freqB.put(x,freqB.getOrDefault(x,0)+1);
           }
           
           for(int x: a){
               if(freqB.getOrDefault(x,0) > 0){
                   result.add(x);
                   freqB.put(x, freqB.get(x) - 1);
               }
           }
           Collections.sort(result);
           return result;
        
    }
}
