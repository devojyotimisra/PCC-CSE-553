package test_package2;

import test_package1.ClassTest1;

public class ClassTest2 extends ClassTest1
{
    public void functionTest5()
    {
        functionTest3();
        System.out.println("Inside ClassTest2.functionTest5()");
    }
}
