import java.util.*;

class MyStack <T>
{
    private ArrayList<T> s = new ArrayList<>();
    
    public void push(T ele)
    {
        s.add(ele);
    }

    public int isEmpty() throws Exception
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
}

class Stack 
{
    public static void main(String args[])
    {
        MyStack<Integer> s = new MyStack<>();  
        s.peek();
        
    }
}
