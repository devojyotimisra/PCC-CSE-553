import java.util.*;

class MyStack <T>
{
    private ArrayList<T> s = new ArrayList<>();
    
    public void push(T ele)
    {
        s.add(ele);
    }

    public T pop() throws Exception
    {
        if(s.size()!=0)
        {
            T temp = s.get(s.size()-1);
            s.remove(s.size()-1);
            return temp;
        }
        else
        {
            Exception e = new Exception("Undeflow!!!");
            throw e;
        }
    }
    
    public T top() throws Exception
    {
        if(s.size()!=0)
        {
            return s.get(s.size()-1);
        }
        else
        {
            Exception e = new Exception("Undeflow!!!");
            throw e;
        }

    }
}

class Stack 
{
    public static void main(String args[])
    {
        MyStack<Integer> 
    }
}
