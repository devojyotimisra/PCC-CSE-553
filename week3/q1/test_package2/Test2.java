package test_package2;

import test_package1.ClassTest1;

class Test2
{
    public static void main(String args[])
    {
        ClassTest1 obj2 = new ClassTest1();
        ClassTest2 obj3 = new ClassTest2();

        System.out.println("Inside test_package2 main()");

        obj2.functionTest2();
        obj3.functionTest5();
    }
}
