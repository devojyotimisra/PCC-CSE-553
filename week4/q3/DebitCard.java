// Make a Java program for Accounting purposes of Debit-Credit using File Handling.

import java.io.*;
import java.util.*;

class DebitCard
{
    public static void create(float amount) throws Exception
    {
        File f = new File("ledger.txt");
        f.createNewFile();

        FileWriter w = new FileWriter(f);
        w.write("trans_type,amount,balance\nd,"+amount+","+amount+"\n");
        w.close();
    }

    public static void credit(float amount) throws Exception
    {
        String temp="";

        File f = new File("ledger.txt");

        Scanner sc = new Scanner(f);
        while(sc.hasNextLine())
        {
            temp=sc.nextLine();
        }
        sc.close();

        String str[] = temp.split(",");
        float balance = Float.parseFloat(str[((str.length)-1)]);
        
        FileWriter w = new FileWriter(f, true);
        w.write("c,"+amount+","+(balance+amount)+"\n");
        w.close();
    }

    public static void debit(float amount) throws Exception
    {
        String temp="";

        File f = new File("ledger.txt");

        Scanner sc = new Scanner(f);
        while(sc.hasNextLine())
        {
            temp=sc.nextLine();
        }
        sc.close();

        String str[] = temp.split(",");
        float balance = Float.parseFloat(str[((str.length)-1)]);

        if((amount-balance)<0)
        {
            System.out.println("Debit declined");
        }      
        else
        {
            FileWriter w = new FileWriter(f, true);
            w.write("c,"+amount+","+(amount-balance)+"\n"); 
            w.close();
        }
    }

    public static void main(String srgs[]) throws Exception
    {
        create(10000);
        credit(12000);
        debit(100000);
        debit(5000);
    }
}
