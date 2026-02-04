class MyLinkedList <T>
{
    private class Node
    {
        private T data;
        private Node next;

        protected Node(T d)
        {
            data=d;
            next=null;
        }
    }

    private Node head;

    public MyLinkedList()
    {
        head=new Node(null);
    }

    public void addFirst(T d)
    {
        if(head.data==null)
        {
            head.data=d;
        }
        else
        {
            Node n = new Node(d);
            n.next=head;
            head=n;
        }
    }
    
    public void addLast(T d)
    {
        if(head.data==null)
        {
            head.data=d;
        }
        else
        {
            Node n = new Node(d);
            Node temp = head;
            
            while(temp.next!=null)
            {
                temp = temp.next;
            }
                
            temp.next = n;        
        }
    }
        
    public void remove(T d)
    {
        if(head.data==null)
        {
            return;
        }
        else if(head.data.equals(d))
        {
            head=head.next;
        }
        else
        {
            Node temp = head;
    
            while(temp.next!=null)
            {
                if(temp.next.data.equals(d))
                {
                    temp.next=temp.next.next;
                    continue;
                }
                temp = temp.next;
            }
        }
    }

    public void display()
    {
        if(head.data==null)
        {
            return;
        }
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}

class LinkedList
{
    public static void main(String args[])
    {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.addLast(10);
        l.display();
        l.addFirst(20);
        l.display();
        l.addLast(10);
        l.display();
        l.addFirst(20);
        l.display();
        l.remove(10);
        l.display();
    }
}
