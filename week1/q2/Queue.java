import java.util.*;

class MyQueue <T>
{
    ArrayList<T> q = new ArrayList<>();

    private int isEmpty() throws Exception
    {
        if(q.size()!=0)
        {
            return 0;
        }
        else
        {
            Exception e = new Exception("Undeflow!!!");
            throw e;
        }
    }

    public void enqueue(T ele)
    {
        q.add(ele);
    }

    public T dequeue()
    {
        int temp;
        try
        {
            temp = isEmpty();
        }
        catch(Exception e)
        {
            temp = 1;
            System.out.println(e.getMessage());
        }
        if(temp==0)
        {
            T t = q.get(0);
            q.remove(0);
            return t;
        }
        return null;
    }

    public T peek()
    {
        int temp;
        try
        {
            temp = isEmpty();
        }
        catch(Exception e)
        {
            temp = 1;
            System.out.println(e.getMessage());
        }
        if(temp==0)
        {
            return q.get(0);
        }
        return null;
    }

    public void display()
    {
        for(int i=0;i<q.size();i++)
        {
            System.out.print(q.get(i)+" ");
        }
    }
}

class Queue 
{
    public static void main(String args[])
    {
        MyQueue<Integer> s = new MyQueue<>();  
        s.peek();
        s.enqueue(10);
        s.peek();
        s.dequeue();
        s.peek();
    }
}
