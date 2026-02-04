class MyBST
{
    private class Node
    {
        Node left;
        Node right;
        int data;

        protected Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }

    private Node root = null;

    private void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
    }

    private void find(Node root, int d)
    {
        if(root==null)
        {
            System.out.println("Not Found");
            return;
        }
        else
        {
            if(root.data==d)
            {
                System.out.println("Found");
            }
            else
            {
                if(d<root.data)
                {
                    find(root.left, d);
                }
                else
                {
                    find(root.right, d);
                }
            }
        }
    }

    private Node insert(Node root, int d)
    {
        if(root==null)
        {
            root = new Node(d);
            return root; 
        }
        else
        {
            if(d<root.data)
            {
                root.left=insert(root.left, d);
            }
            else if(d>root.data)
            {
                root.right=insert(root.right, d);
            }
            return root;
        }
    }

    public void inOrderTraversal()
    {
        inOrder(root);
        System.out.println();
    }

    public void findKey(int key)
    {
        find(root, key);
    }

    public void insertValue(int data)
    {
        root=insert(root, data);
    }
}

class BST
{
    public static void main(String args[])
    {
        MyBST bst = new MyBST();
        bst.insertValue(10);
        bst.insertValue(20);
        bst.insertValue(30);
        bst.insertValue(40);
        bst.inOrderTraversal();
        bst.findKey(10); 
        bst.findKey(50); 
    }
}
