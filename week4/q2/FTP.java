// Implement File Transfer Protocol in Java i.e. 
// transfer of files from one package to another package using File handling.

import java.io.*;
import java.util.*;

class FTP {
    public static void main(String[] args) throws Exception 
    {
        
        String sourceFolderName= "source";
        String destinationFolderName= "destination";
        
        String sourceFileName= "source.txt";
        String destinationFileName= "destination.txt";
        
        String source= "";
        String destination= "";

        File f1 = new File(sourceFolderName+"/"+sourceFileName);
        File f2 = new File(destinationFolderName+"/"+destinationFileName);
        
        Scanner sc1 = new Scanner(f1);
        while(sc1.hasNextLine())
            {
                source+=(sc1.nextLine());
            }
            sc1.close();
            
            Scanner sc2 = new Scanner(f2);
            while(sc2.hasNextLine())
        {
            destination+=(sc2.nextLine());
        }
        sc2.close();
        
        f1.delete();
        f2.delete();
        
        File f3 = new File(destinationFolderName+"/"+sourceFileName);
        f3.createNewFile();
        File f4 = new File(sourceFolderName+"/"+destinationFileName);
        f4.createNewFile();

        FileWriter w1 = new FileWriter(f3);
        w1.write(source);
        w1.close();

        FileWriter w2 = new FileWriter(f4);
        w2.write(destination);
        w2.close();
    }
}
