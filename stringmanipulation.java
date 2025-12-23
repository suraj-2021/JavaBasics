public class StringInserter {
    public static void main(String[]args){
        String original = "JavaGramming";
        String insert  = "Prog";
        
        char[] originalArray = original.toCharArray();
        char[] insertArray = insert.toCharArray();
        char[] resultArray = new char[original.length()+insert.length()];
        
        //copying the elements up to the middle of the originalArray and inserting them in Result array 
        int k =0;
        for(int i=0;i<original.length()/2;i++){
            resultArray[k] = originalArray[i];
            k++;
            
        }
        
        //now copying the elemets from insert string into the resultArray from midpoint and onwards 
        for(int i=0;i<insert.length();i++){
            resultArray[k] = insertArray[i];
            k++; 
        }
        
        //copying the remaining elemets from the original into the final array 
        
        for(int i=original.length()/2;i<original.length();i++){
            resultArray[k] = originalArray[i];
            k++;
        }
        
        //convert the result charArray into string 
        String resultString = new String(resultArray);
        
        //print the result 
        System.out.println("Final Result Array is : "+resultString);
    }
}
