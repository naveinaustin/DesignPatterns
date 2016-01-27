package singleton.example1;

public class MyClass
{
    private static MyClass myClass;

    private MyClass()
    {

    }

    public static MyClass getInstance()
    {
        if(null == myClass)
        {
            myClass = new MyClass();
        }
        return myClass;
    }
}
