import java.io.*; 
  
public class Merge  
{ 
    public static void main(String[] args) throws IOException  
    { 
        // printwriter display result of two file in one called output.txt 
        PrintWriter pw = new PrintWriter("output.txt"); 
          
        // bufferreader read a.txt file 
        BufferedReader br = new BufferedReader(new FileReader("a.txt")); 
          //this line read the statement of a.txt
        String line = br.readLine(); 
          
        // loop to copy each line of  
        // a.txt to output.txt
        while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        br = new BufferedReader(new FileReader("b.txt")); 
          
        line = br.readLine(); 
          
        // loop to copy each line of  
        // b.txt to  output.txt 
        while(line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        pw.flush(); 
          
        // closing all file resources 
        br.close(); 
        pw.close(); 
          
        System.out.println("Done..."); 
    } 
} 