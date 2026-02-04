// Write a Java program to implement various functionalities of Threads.

class MyThreadOne extends Thread
{
    public void run()
    {
        for(int i=0; i<100; i++)
        {
            System.out.println("Hi");
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class MyThreadTwo extends Thread
{
    public void run()
    {
        for(int i=0; i<100; i++)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class Threads
{
    public static void main(String args[])
    {
        Thread t1 = new MyThreadOne();
        Thread t2 = new MyThreadTwo();

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Finished");
    }
}