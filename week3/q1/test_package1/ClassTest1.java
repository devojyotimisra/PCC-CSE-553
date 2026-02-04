package test_package1;

public class ClassTest1
{
    private void functionTest1()
    {
        System.out.println("Inside ClassTest1.functionTest1()");
    }

    public void functionTest2()
    {
        functionTest1();
        System.out.println("Inside ClassTest1.functionTest2()");
    }

    protected void functionTest3()
    {
        functionTest2();
        System.out.println("Inside ClassTest1.functionTest3()");
    }
    
    void functionTest4()
    {
        functionTest3();
        System.out.println("Inside ClassTest1.functionTest4()");
    }
}

