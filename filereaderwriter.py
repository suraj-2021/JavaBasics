import java.io.*;
import java.util.*;
class FileReaderWriter{
    
    public void readerwritermethod(){
        try{
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text to write to a file!");
        text = sc.nextLine();
        FileWriter writer = new FileWriter("myfile.txt");
        
        writer.write(text);
        
        writer.close();
        System.out.println("Written to a file successfully!");
        }catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
        //reading to the same file and displaying the content
        
        try{
            String line;
            FileReader  reader = new FileReader("myfile.txt");
            
            while((line= reader.nextLine())){
                
                System.out.println(line);
        }
        }catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
        
        
    }   
}

public class Main{
    public static void main(String[]args){
        FileReaderWriter f1 = new FileReaderWriter();
        f1.readerwritermethod();
    }
}
