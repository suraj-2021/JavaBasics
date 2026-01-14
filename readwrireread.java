import java.io.*; 

public class Main{
    public static void main(String[] args){
        FileInputStream reader = null; 
        FileOutputStream writer = null;
        FileInputStream destreader=null;
        
        try{
            reader = new FileInputStream("source.txt");
            writer = new FileOutputStream("destination.txt"); 
            
            int c; 
            
            while((c=reader.read())!=-1){
                writer.write((char)c);
            }
            
        } catch(IOException e){
            System.out.println("Error Occured!");
        } finally{
            try{
                if(reader!=null){
                    reader.close();
                }
                if(writer!=null){
                    writer.close();
                }    
                
            }catch(IOException e){
                System.out.println("Error Occured!");
            }
        }
    
    try {
        destreader = new FileInputStream("destination.txt");
        
        int c;
        while((c=destreader.read())!=-1){
            System.out.print((char)c);
        }
    } catch(IOException e){
        System.out.println("Error opening the file!");
    } finally{
           try{
               if(destreader!=null){
                destreader.close();
            }
        }catch(IOException e){
            System.out.println("Error opening the file!");
        }
    }
    
    
    } 
}
