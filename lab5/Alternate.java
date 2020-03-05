import java.io.*; 
  
public class Alternate  
{ 
    public static void main(String[] args) throws IOException  
    { 
        // PrintWriter object for output.txt 
        PrintWriter pw = new PrintWriter("output.txt"); 
          
        // BufferedReader object for file1.txt 
        BufferedReader br1 = new BufferedReader(new FileReader("a.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("b.txt")); 
          
          
        String line1 = br1.readLine(); 
        String line2 = br2.readLine(); 
          
        // loop to copy lines of  
        // a.txt and b.txt  
        // to  output.txt alternatively 
        while (line1 != null || line2 !=null) 
        { 
            if(line1 != null) 
            { 
                pw.println(line1); 
                line1 = br1.readLine(); 
            } 
              
            if(line2 != null) 
            { 
                pw.println(line2); 
                line2 = br2.readLine(); 
            } 
        } 
      
        pw.flush(); 
          
        // closing resources 
        br1.close(); 
        br2.close(); 
        pw.close(); 
          
        System.out.println("Done..."); 
    } 
} 