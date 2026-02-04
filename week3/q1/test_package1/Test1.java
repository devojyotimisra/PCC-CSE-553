package test_package1;

class Test1
{
    public static void main(String args[])
    {
        ClassTest1 obj1 = new ClassTest1();

        System.out.println("Inside test_package1 main()");
        
        //can't use obj1.functionTest1(), since it is a private method
        obj1.functionTest2();
        obj1.functionTest3();
        obj1.functionTest4();
        System.out.println("Inside main of Test1");
    }
}