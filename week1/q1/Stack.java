import java.util.*;

class MyStack <T> 
{
    private ArrayList<T> s = new ArrayList<>();
    
    public void push(T ele)
    {
        s.add(ele);
    }

    private int isEmpty() throws Exception
    {
        if(s.size()!=0)
        {
            return 0;
        }
        else
        {
            Exception e = new Exception("Undeflow!!!");
            throw e;
        }
    }

    public T pop()
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
            T t = s.get(s.size()-1);
            s.remove(s.size()-1);
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
            return s.get(s.size()-1);
        }
        return null;
    }

    public void display()
    {
        for(int i=s.size()-1;i>=0;i--)
        {
            System.out.print(s.get(i)+" ");
        }
    }
}

class Stack 
{
    public static void main(String args[])
    {
        MyStack<Integer> s = new MyStack<>();  
        s.peek();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.peek();
    }
}
