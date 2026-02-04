// Write a Java program that utilises all the File handing functionalities:
// Create, Read, Write, Update, Delete, Read-Write permission manager etc.

import java.io.*;
import java.util.*;

class FileHandling
{
    public static void main(String args[]) throws Exception
    {
        File f = new File("demo.txt");
        if(!f.exists()) f.createNewFile();
        
        FileWriter w = new FileWriter(f);
        w.write("Hello World");
        w.close();

        FileWriter a = new FileWriter(f, true);
        a.write("\nNew Line Added");
        a.close();

        Scanner sc = new Scanner(f);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();

        System.out.println("Can Write: " + f.canWrite());
        f.setWritable(false);
        System.out.println("Can Write (after set false): " + f.canWrite());
        f.setWritable(true);
        System.out.println("Can Write (after set true): " + f.canWrite());

        System.out.println("Can Execute: " + f.canExecute());
        f.setExecutable(false);
        System.out.println("Can Execute (after set false): " + f.canExecute());
        f.setExecutable(true);
        System.out.println("Can Execute (after set true): " + f.canExecute());

        if (f.delete()) 
        {    
            System.out.println("File deleted successfullly");
        }
    }
}
